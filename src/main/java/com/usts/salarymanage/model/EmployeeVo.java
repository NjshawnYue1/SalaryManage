package com.usts.salarymanage.model;

import lombok.*;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeVo.java
 * @Description TODO
 * @createTime 2019年11月16日 21:49:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVo extends Employee {
    private static final long serialVersionUID = -6246728142776290021L;

    Long salary;

    private String username;

    private String password;
}
