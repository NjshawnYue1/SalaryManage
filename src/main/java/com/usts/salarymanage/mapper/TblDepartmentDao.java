package com.usts.salarymanage.mapper;

import com.usts.salarymanage.model.TblDepartment;
import com.usts.salarymanage.model.TblDepartmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface TblDepartmentDao {
    long countByExample(TblDepartmentExample example);

    int deleteByExample(TblDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblDepartment record);

    int insertSelective(TblDepartment record);

    List<TblDepartment> selectByExampleWithBLOBs(TblDepartmentExample example);

    List<TblDepartment> selectByExample(TblDepartmentExample example);

    TblDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblDepartment record, @Param("example") TblDepartmentExample example);

    int updateByExampleWithBLOBs(@Param("record") TblDepartment record, @Param("example") TblDepartmentExample example);

    int updateByExample(@Param("record") TblDepartment record, @Param("example") TblDepartmentExample example);

    int updateByPrimaryKeySelective(TblDepartment record);

    int updateByPrimaryKeyWithBLOBs(TblDepartment record);

    int updateByPrimaryKey(TblDepartment record);
}