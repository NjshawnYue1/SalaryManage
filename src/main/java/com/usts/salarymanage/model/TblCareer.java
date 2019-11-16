package com.usts.salarymanage.model;

import java.io.Serializable;

/**
 * tbl_career
 * @author 
 */
public class TblCareer implements Serializable {
    private Integer id;

    /**
     * 职位id
     */
    private Integer careerId;

    /**
     * 职位名称
     */
    private String careerName;

    /**
     * 职位描述
     */
    private String careerDescription;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCareerId() {
        return careerId;
    }

    public void setCareerId(Integer careerId) {
        this.careerId = careerId;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public String getCareerDescription() {
        return careerDescription;
    }

    public void setCareerDescription(String careerDescription) {
        this.careerDescription = careerDescription;
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
        TblCareer other = (TblCareer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCareerId() == null ? other.getCareerId() == null : this.getCareerId().equals(other.getCareerId()))
            && (this.getCareerName() == null ? other.getCareerName() == null : this.getCareerName().equals(other.getCareerName()))
            && (this.getCareerDescription() == null ? other.getCareerDescription() == null : this.getCareerDescription().equals(other.getCareerDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCareerId() == null) ? 0 : getCareerId().hashCode());
        result = prime * result + ((getCareerName() == null) ? 0 : getCareerName().hashCode());
        result = prime * result + ((getCareerDescription() == null) ? 0 : getCareerDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", careerId=").append(careerId);
        sb.append(", careerName=").append(careerName);
        sb.append(", careerDescription=").append(careerDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}