package com.usts.salarymanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.salarymanage.common.AjaxResponse;
import com.usts.salarymanage.mapper.TblEmployeeDao;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.Page;
import com.usts.salarymanage.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeController.java
 * @Description TODO
 * @createTime 2019年11月16日 12:31:00
 */
@RestController
@Slf4j
@RequestMapping("/api")
public class EmployeeController {
    @Resource(name = "employeeServiceImpl")
    EmployeeService employeeService;

    @Resource
    TblEmployeeDao tblEmployeeDao;

    @ApiOperation("新增一条员工记录")
    @PostMapping("/employees")
    public AjaxResponse saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return AjaxResponse.success(employee);
    }

    @ApiOperation("查询员工记录")
    @GetMapping("/employees/{id}")
    public AjaxResponse queryById(@PathVariable int id) {

        return AjaxResponse.success(employeeService.queryOneEmp(id));
    }

    @ApiOperation("查询所有员工信息")
    @GetMapping("/employees")
    public AjaxResponse queryAll(@RequestBody Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Employee> employeeList = tblEmployeeDao.selectByExample(null);
        PageInfo<Employee> pageInfo = PageInfo.of(employeeList);
        return AjaxResponse.success(pageInfo);
    }

    @ApiOperation("根据id更新员工信息 返回操作是否成功")
    @PutMapping("/employees/{id}")
    public AjaxResponse updateById(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id);
        boolean flag = employeeService.updateEmployee(employee);
        return AjaxResponse.success(flag);
    }

    @ApiOperation("根据id删除员工记录")
    @DeleteMapping("/employees/{id}")
    public AjaxResponse deleteById(@PathVariable int id) {
        boolean flag = employeeService.delEmployee(id);
        return AjaxResponse.success(flag);
    }
}
