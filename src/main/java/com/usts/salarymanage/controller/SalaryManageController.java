package com.usts.salarymanage.controller;

import cn.hutool.core.date.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.salarymanage.common.AjaxResponse;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.Page;
import com.usts.salarymanage.model.Salary;
import com.usts.salarymanage.model.Ware;
import com.usts.salarymanage.service.EmployeeService;
import com.usts.salarymanage.service.SalaryService;
import com.usts.salarymanage.service.impl.WareServiceImpl;
import com.usts.salarymanage.util.jxls.JXlsExcelHelper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName SalaryManageController.java
 * @Description 对工资进行的相关操作
 * @createTime 2019年11月17日 13:29:00
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class SalaryManageController {
    @Resource(name = "salaryServiceImpl")
    SalaryService salaryService;

    @Resource(name = "employeeServiceImpl")
    EmployeeService employeeService;

    @Resource
    WareServiceImpl wareService;

    @ApiOperation("新增一条工资记录，返回增加的记录信息")
    @PostMapping("/salaries")
    public AjaxResponse saveSalary(@RequestBody Salary salary) {
        Employee employee = employeeService.queryOneEmp(salary.getEmpId());
        if (employee == null) {
            return AjaxResponse.success("增加失败");
        }
        salaryService.insertSalary(salary);
        return AjaxResponse.success(salary);
    }

    @ApiOperation("根据id删除一条工资记录,返回操作是否成功")
    @DeleteMapping("/salaries/{id}")
    public AjaxResponse delSalary(@PathVariable int id) {
        boolean flag = salaryService.delSalary(id);
        return AjaxResponse.success(flag);

    }

    @ApiOperation("根据id修改一条工资记录,返回修改后的数据")
    @PutMapping("/salaries/{id}")
    public AjaxResponse updateSalary(@PathVariable int id, @RequestBody Salary salary) {
        salary.setId(id);
        boolean flag = salaryService.updateSalary(salary);
        return AjaxResponse.success(flag);
    }

    @ApiOperation("根据id查询一条工资记录")
    @GetMapping("/salaries/{id}")
    public AjaxResponse getOneSal(@PathVariable int id) {

        Salary salary = salaryService.querySalaryById(id);

        return AjaxResponse.success(salary);
    }

    @ApiOperation("分页查询所有工资记录")
    @GetMapping("/salaries")
    public AjaxResponse getAllSal(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Salary> salaryList = salaryService.queryAll();
        PageInfo<Salary> pageInfo = PageInfo.of(salaryList);
        return AjaxResponse.success(pageInfo);
    }

    @GetMapping("/salaries/down")
    public void downloadNu(HttpServletResponse response) {
        // 查询所有员工信息
        List<Employee> employees = employeeService.queryAllEmp();
        Map<String, Object> result = new HashMap<>();
        List<Ware> sal = new ArrayList<>();

        employees.stream().forEach(var -> {
            Ware ware = new Ware();
            BeanUtils.copyProperties(var, ware, "id");
            ware.setEmpid(var.getId());
            sal.add(ware);
        });

        result.put("sal", sal);

        // 设置响应Http报文头信息
        JXlsExcelHelper.getInstance().setRespHeader(
                "item_" + DateUtil.format(new Date(), "yyyy_MM_dd_HH_mm_ss"),
                JXlsExcelHelper.XLSX,
                response
        );
        log.info("正在导出记录...");

        // 读取模板生成数据
        try (InputStream in = new ClassPathResource("templete/export_salary_template.xlsx").getInputStream();
             OutputStream out = response.getOutputStream()) {
            JXlsExcelHelper.getInstance().export(in, out, result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("读取模板生成失败:{}", e.getMessage());
            throw new RuntimeException("导出失败");
        }
    }


    /**
     * 导入数据
     */
    @PostMapping("/salaries/upload")
    public AjaxResponse importTempleteData(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
        Map<String, Object> importData = new HashMap<>();
        importData.put("sal", new ArrayList<Ware>());
        log.info("正在导入记录...");
        try (InputStream importConfigXML = new ClassPathResource("templete/import_salary_template.xml").getInputStream();
             InputStream importFile = file.getInputStream()) {
            JXlsExcelHelper.getInstance().importExcel(importConfigXML, importFile, importData);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("导入记录失败:{}", e.getMessage());
            throw new RuntimeException("导入失败");
        }
        List<Ware> teachersFromFile = (List<Ware>) importData.get("sal");
        teachersFromFile.stream().forEach(var -> {
            var.setFinals(
                    var.getBasesalary()
                            + var.getExtra()
                            + var.getHouse()
                            + var.getLosejob()
                            + var.getWare()
            );
            wareService.insert(var);
        });
        return AjaxResponse.success("OK");
    }

    @GetMapping("/find/salary")
    public AjaxResponse returnAll() {
        return AjaxResponse.success(wareService.select());
    }


}
