package com.usts.salarymanage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * tbl_emp
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Serializable {

    private static final long serialVersionUID = -6873846769228824933L;
    /**
     * 员工id
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 员工性别
     */
    private String empSex;

    /**
     * 员工年龄
     */
    private Integer empAge;

    /**
     * 员工部门
     */
    private Integer empDepartment;

    /**
     * 员工职位
     */
    private Integer empCareer;


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getEmpSex() == null ? other.getEmpSex() == null : this.getEmpSex().equals(other.getEmpSex()))
            && (this.getEmpAge() == null ? other.getEmpAge() == null : this.getEmpAge().equals(other.getEmpAge()))
            && (this.getEmpDepartment() == null ? other.getEmpDepartment() == null : this.getEmpDepartment().equals(other.getEmpDepartment()))
            && (this.getEmpCareer() == null ? other.getEmpCareer() == null : this.getEmpCareer().equals(other.getEmpCareer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getEmpSex() == null) ? 0 : getEmpSex().hashCode());
        result = prime * result + ((getEmpAge() == null) ? 0 : getEmpAge().hashCode());
        result = prime * result + ((getEmpDepartment() == null) ? 0 : getEmpDepartment().hashCode());
        result = prime * result + ((getEmpCareer() == null) ? 0 : getEmpCareer().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empName=").append(empName);
        sb.append(", empSex=").append(empSex);
        sb.append(", empAge=").append(empAge);
        sb.append(", empDepartment=").append(empDepartment);
        sb.append(", empCareer=").append(empCareer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}