package com.usts.salarymanage.service.impl;

import com.usts.salarymanage.mapper.TblEmployeeDao;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeServiceImpl.java
 * @Description TODO
 * @createTime 2019年11月16日 12:47:00
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    TblEmployeeDao tblEmployeeDao;


    @Override
    public Employee saveEmployee(Employee employee) {
        tblEmployeeDao.insert(employee);
        return employee;
    }

    @Override
    public boolean delEmployee(int id) {
        int result = tblEmployeeDao.deleteByPrimaryKey(id);
        return result > 0;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        int result = tblEmployeeDao.updateByPrimaryKey(employee);
        return result > 0;
    }

    @Override
    public Employee queryOneEmp(int id) {
        Employee employee = tblEmployeeDao.selectByPrimaryKey(id);
        if(employee == null){
            return new Employee();
        }
        return tblEmployeeDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> queryAllEmp() {

        List<Employee> employeeList = tblEmployeeDao.selectByExample(null);
        if (employeeList.size() == 0) {
            return new ArrayList<Employee>();
        }
        return tblEmployeeDao.selectByExample(null);
    }

    @Override
    public List<Employee> queryByCareerId(int careerId) {
        List<Employee> employeeList = tblEmployeeDao.selectByDepartmentId(careerId);
        if (employeeList.size() == 0) {
            return new ArrayList<Employee>();
        }
        return tblEmployeeDao.selectByCareerId(careerId);
    }

    @Override
    public List<Employee> queryByDepartmentId(int departmentId) {
        List<Employee> employeeList = tblEmployeeDao.selectByDepartmentId(departmentId);
        if (employeeList.size() == 0) {
            return new ArrayList<Employee>();
        }
        return tblEmployeeDao.selectByDepartmentId(departmentId);
    }

    @Override
    public List<Employee> findLogin(Employee employee) {
        return tblEmployeeDao.findByUser(employee);
    }
}
