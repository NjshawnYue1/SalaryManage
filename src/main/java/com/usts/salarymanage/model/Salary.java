package com.usts.salarymanage.model;

import java.io.Serializable;

/**
 * tbl_salary
 * @author 
 */
public class Salary implements Serializable {
    private Integer id;

    /**
     * 员工基本工资
     */
    private Long baseSalary;

    /**
     * 津贴
     */
    private Long allowance;

    /**
     * 奖金
     */
    private Long bouns;

    /**
     * 保险
     */
    private Long insurance;

    /**
     * 住房公积金
     */
    private Long housingFund;

    private Integer empId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Long getAllowance() {
        return allowance;
    }

    public void setAllowance(Long allowance) {
        this.allowance = allowance;
    }

    public Long getBouns() {
        return bouns;
    }

    public void setBouns(Long bouns) {
        this.bouns = bouns;
    }

    public Long getInsurance() {
        return insurance;
    }

    public void setInsurance(Long insurance) {
        this.insurance = insurance;
    }

    public Long getHousingFund() {
        return housingFund;
    }

    public void setHousingFund(Long housingFund) {
        this.housingFund = housingFund;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

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
        Salary other = (Salary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBaseSalary() == null ? other.getBaseSalary() == null : this.getBaseSalary().equals(other.getBaseSalary()))
            && (this.getAllowance() == null ? other.getAllowance() == null : this.getAllowance().equals(other.getAllowance()))
            && (this.getBouns() == null ? other.getBouns() == null : this.getBouns().equals(other.getBouns()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getHousingFund() == null ? other.getHousingFund() == null : this.getHousingFund().equals(other.getHousingFund()))
            && (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBaseSalary() == null) ? 0 : getBaseSalary().hashCode());
        result = prime * result + ((getAllowance() == null) ? 0 : getAllowance().hashCode());
        result = prime * result + ((getBouns() == null) ? 0 : getBouns().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getHousingFund() == null) ? 0 : getHousingFund().hashCode());
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", baseSalary=").append(baseSalary);
        sb.append(", allowance=").append(allowance);
        sb.append(", bouns=").append(bouns);
        sb.append(", insurance=").append(insurance);
        sb.append(", housingFund=").append(housingFund);
        sb.append(", empId=").append(empId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}