package com.usts.salarymanage.service.impl;

import com.usts.salarymanage.mapper.TblSalaryDao;
import com.usts.salarymanage.model.Salary;
import com.usts.salarymanage.service.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName SalaryServiceImpl.java
 * @Description TODO
 * @createTime 2019年11月16日 13:22:00
 */
@Slf4j
@Service
public class SalaryServiceImpl implements SalaryService {

    @Resource
    TblSalaryDao tblSalaryDao;

    @Override
    public Salary insertSalary(Salary salary) {
        tblSalaryDao.insert(salary);
        return salary;
    }

    @Override
    public boolean delSalary(int id) {
        return tblSalaryDao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean updateSalary(Salary salary) {
        return tblSalaryDao.updateByPrimaryKey(salary) > 0;
    }

    @Override
    public Salary querySalary(int id) {
        return tblSalaryDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Salary> queryAll() {
        return tblSalaryDao.selectByExample(null);
    }

    @Override
    public Salary queryByEmpId(int employeeId) {

        return tblSalaryDao.selectByEmpId(employeeId);
    }
}
