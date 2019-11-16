package com.usts.salarymanage;

import com.usts.salarymanage.mapper.TblEmployeeDao;
import com.usts.salarymanage.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SalarymanageApplicationTests {

    @Resource
    TblEmployeeDao tblEmployeeDao;

    @Resource(name = "employeeServiceImpl")
    EmployeeService employeeService;

    @Test
    void contextLoads() {
//        System.out.println(tblEmployeeDao.selectByDepartmentId(2));

        System.out.println(employeeService.queryByCareerId(2));

    }

}
