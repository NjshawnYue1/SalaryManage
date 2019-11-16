package com.usts.salarymanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.usts.salarymanage.mapper"})
public class SalarymanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalarymanageApplication.class, args);
    }

}
