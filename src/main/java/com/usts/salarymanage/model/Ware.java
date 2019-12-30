package com.usts.salarymanage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ware {

    private Integer id;

    // 员工ID
    private Integer empid;

    // 员工姓名
    private String empName;

    // 基本工资
    private Integer basesalary;

    // 住房公积金
    private Integer house;

    // 失业保险
    private Integer losejob;

    // 福利津贴
    private Integer ware;

    // 额外工资
    private Integer extra;

    // 最终工资
    private Integer finals;


}
