package com.usts.salarymanage.mapper;

import com.usts.salarymanage.model.Salary;
import com.usts.salarymanage.model.SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSalaryDao {
    long countByExample(SalaryExample example);

    int deleteByExample(SalaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    List<Salary> selectByExample(SalaryExample example);

    Salary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    Salary selectByEmpId(int empId);
}