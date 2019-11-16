package com.usts.salarymanage.model;

import com.usts.salarymanage.service.EmployeeService;
import lombok.*;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName EmployeeVo.java
 * @Description TODO
 * @createTime 2019年11月16日 21:49:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVo extends Employee {
    private static final long serialVersionUID = -6246728142776290021L;

    Long salary;
}
