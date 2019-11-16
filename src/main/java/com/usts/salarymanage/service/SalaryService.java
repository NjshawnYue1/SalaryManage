package com.usts.salarymanage.service;

import com.usts.salarymanage.model.Salary;

import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName SalaryService.java
 * @Description TODO
 * @createTime 2019年11月16日 13:18:00
 */
public interface SalaryService {
    /**
     * 新增一条薪资记录
     *
     * @param salary
     * @return
     */
    Salary insertSalary(Salary salary);

    /**
     * 删除一条薪资记录
     *
     * @param id
     * @return
     */
    boolean delSalary(int id);

    /**
     * 更新一条薪资记录
     *
     * @param salary
     * @return
     */
    boolean updateSalary(Salary salary);

    /**
     * 查询一条薪资记录
     *
     * @param id
     * @return
     */
    Salary querySalary(int id);

    /**
     * 查询所有记录
     *
     * @return
     */
    List<Salary> queryAll();
}
