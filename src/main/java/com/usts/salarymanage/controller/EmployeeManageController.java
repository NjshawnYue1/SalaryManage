package com.usts.salarymanage.controller;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.salarymanage.common.AjaxResponse;
import com.usts.salarymanage.mapper.TblEmployeeDao;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.EmployeeVo;
import com.usts.salarymanage.model.Page;
import com.usts.salarymanage.model.Salary;
import com.usts.salarymanage.service.EmployeeService;
import com.usts.salarymanage.service.SalaryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeController.java
 * @Description 对员工进行的相关操作
 * @createTime 2019年11月16日 12:31:00
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class EmployeeManageController {
    @Resource(name = "employeeServiceImpl")
    EmployeeService employeeService;

    @Resource(name = "salaryServiceImpl")
    SalaryService salaryService;

    @Resource
    TblEmployeeDao tblEmployeeDao;


    @ApiOperation("新增一条员工记录,返回新增的员工记录")
    @PostMapping("/employees")
    public AjaxResponse saveEmployee(@RequestBody EmployeeVo employeeVo) {
        Employee employee = new Employee();
        BeanUtil.copyProperties(employeeVo, employee);
        employeeService.saveEmployee(employee);
        return AjaxResponse.success(employeeVo);
    }

    @ApiOperation("查询员工记录")
    @GetMapping("/employees/{id}")
    public AjaxResponse queryById(@PathVariable int id) {

        Salary salary = salaryService.queryByEmpId(id);
        if (salary == null) {
            return AjaxResponse.success(employeeService.queryOneEmp(id));
        }
        Long result = salary.getBaseSalary() + salary.getAllowance() + salary.getBouns() - salary.getInsurance() - salary.getHousingFund();
        EmployeeVo employeeVo = new EmployeeVo();
        employeeVo.setSalary(result);
        BeanUtil.copyProperties(employeeService.queryOneEmp(id), employeeVo);
        return AjaxResponse.success(employeeVo);
    }

    @ApiOperation("查询所有员工信息 返回分页查询的结果")
    @GetMapping("/employees")
    public AjaxResponse queryAll(@ApiParam("分页参数封装 页数和每页数量") @RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Employee> employeeList = tblEmployeeDao.selectByExample(null);
        List<EmployeeVo> employeeVoList = new ArrayList<>();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            EmployeeVo employeeVo = new EmployeeVo();
            Salary salary = salaryService.queryByEmpId(employee.getId());
            if (salary == null) {
                employeeVo.setSalary(0L);
                BeanUtil.copyProperties(employee, employeeVo);
                employeeVoList.add(employeeVo);
                continue;
            }
            Long result = salary.getBaseSalary() + salary.getAllowance() + salary.getBouns() - salary.getInsurance() - salary.getHousingFund();
            employeeVo.setSalary(result);
            BeanUtil.copyProperties(employee, employeeVo);
            employeeVoList.add(employeeVo);
        }
        PageInfo<EmployeeVo> pageInfo = PageInfo.of(employeeVoList);
        log.info(pageInfo.toString());
        return AjaxResponse.success(pageInfo);
    }

    @ApiOperation("根据id更新员工信息 返回操作是否成功")
    @PutMapping("/employees/{id}")
    public AjaxResponse updateById(@PathVariable  int id, @RequestBody EmployeeVo employeeVo) {
        Employee employee = new Employee();
        BeanUtil.copyProperties(employeeVo, employee);
        employee.setId(id);
        boolean flag = employeeService.updateEmployee(employee);
        return AjaxResponse.success(flag);
    }

    @ApiOperation("根据id删除员工记录,返回操作是否成功")
    @DeleteMapping("/employees/{id}")
    public AjaxResponse deleteById(@PathVariable int id) {
        boolean flag = employeeService.delEmployee(id);
        return AjaxResponse.success(flag);
    }

    @ApiOperation("根据职位id分页查询员工,返回员工列表")
    @GetMapping("/employees/careers/{careerId}")
    public AjaxResponse selectByCareerId(@PathVariable int careerId, @RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Employee> employeeList = employeeService.queryByCareerId(careerId);
        List<EmployeeVo> employeeVoList = new ArrayList<>();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            EmployeeVo employeeVo = new EmployeeVo();
            Employee employee = iterator.next();
            Salary salary = salaryService.queryByEmpId(employee.getId());
            if (salary == null) {
                employeeVo.setSalary(0L);
                BeanUtil.copyProperties(employee, employeeVo);
                employeeVoList.add(employeeVo);
                continue;
            }
            Long result = salary.getBaseSalary() + salary.getAllowance() + salary.getBouns() - salary.getInsurance() - salary.getHousingFund();
            employeeVo.setSalary(result);
            BeanUtil.copyProperties(employee, employeeVo);
            employeeVoList.add(employeeVo);
        }
        PageInfo<EmployeeVo> pageInfo = PageInfo.of(employeeVoList);
        return AjaxResponse.success(pageInfo);
    }

    @ApiOperation("根据部门id分页查询员工列表")
    @GetMapping("/employees/departments/{departmentId}")
    public AjaxResponse selectByDepartmentId(@PathVariable int departmentId, @RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Employee> employeeList = employeeService.queryByCareerId(departmentId);
        List<EmployeeVo> employeeVoList = new ArrayList<>();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            EmployeeVo employeeVo = new EmployeeVo();
            Salary salary = salaryService.queryByEmpId(employee.getId());
            if (salary == null) {
                employeeVo.setSalary(0L);
                BeanUtil.copyProperties(employee, employeeVo);
                employeeVoList.add(employeeVo);
                continue;

            }
            Long result = salary.getBaseSalary() + salary.getAllowance() + salary.getBouns() - salary.getInsurance() - salary.getHousingFund();
            employeeVo.setSalary(result);
            BeanUtil.copyProperties(employee, employeeVo);
            employeeVoList.add(employeeVo);
        }
        PageInfo<EmployeeVo> pageInfo = PageInfo.of(employeeVoList);
        return AjaxResponse.success(pageInfo);
    }
}
