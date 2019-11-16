package com.usts.salarymanage.mapper;

import com.usts.salarymanage.model.TblCareer;
import com.usts.salarymanage.model.TblCareerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

public interface TblCareerDao {
    long countByExample(TblCareerExample example);

    int deleteByExample(TblCareerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblCareer record);

    int insertSelective(TblCareer record);

    List<TblCareer> selectByExampleWithBLOBs(TblCareerExample example);

    List<TblCareer> selectByExample(TblCareerExample example);

    TblCareer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblCareer record, @Param("example") TblCareerExample example);

    int updateByExampleWithBLOBs(@Param("record") TblCareer record, @Param("example") TblCareerExample example);

    int updateByExample(@Param("record") TblCareer record, @Param("example") TblCareerExample example);

    int updateByPrimaryKeySelective(TblCareer record);

    int updateByPrimaryKeyWithBLOBs(TblCareer record);

    int updateByPrimaryKey(TblCareer record);
}