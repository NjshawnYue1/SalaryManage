package com.usts.salarymanage.service;

import com.usts.salarymanage.model.Employee;
import com.usts.salarymanage.model.Page;

import java.util.List;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeService.java
 * @Description TODO
 * @createTime 2019年11月16日 12:33:00
 */
public interface EmployeeService {
    /**
     * 新增员工
     *
     * @param employee
     * @return 保存员工的信息
     */
    Employee saveEmployee(Employee employee);

    /**
     * 根据id删除员工
     *
     * @param id
     * @return 操作是否成功
     */
    boolean delEmployee(int id);

    /**
     * 更新员工记录
     *
     * @param employee
     * @return 操作是否成功
     */
    boolean updateEmployee(Employee employee);

    /**
     * 根据id查询员工
     *
     * @param id
     * @return 员工信息
     */
    Employee queryOneEmp(int id);

    /**
     * 查询所有员工
     *
     * @return 员工列表
     */
    List<Employee> queryAllEmp();

    /**
     * 根据职位查询员工
     *
     * @param careerId
     * @return 员工列表
     */
    List<Employee> queryByCareerId(int careerId);

    /**
     * 根据部门查询员工
     *
     * @param departmentId
     * @return 员工列表
     */
    List<Employee> queryByDepartmentId(int departmentId);


}
