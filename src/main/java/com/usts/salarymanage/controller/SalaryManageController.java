package com.usts.salarymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.salarymanage.common.AjaxResponse;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.Page;
import com.usts.salarymanage.model.Salary;
import com.usts.salarymanage.service.EmployeeService;
import com.usts.salarymanage.service.SalaryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName SalaryManageController.java
 * @Description TODO
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
}
