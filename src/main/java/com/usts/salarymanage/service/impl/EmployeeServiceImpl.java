package com.usts.salarymanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usts.salarymanage.mapper.TblCareerDao;
import com.usts.salarymanage.mapper.TblDepartmentDao;
import com.usts.salarymanage.mapper.TblEmployeeDao;
import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.Page;
import com.usts.salarymanage.model.TblCareer;
import com.usts.salarymanage.model.TblDepartment;
import com.usts.salarymanage.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        return tblEmployeeDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> queryAllEmp() {


        return tblEmployeeDao.selectByExample(null);
    }
}
