package com.usts.salarymanage.service.impl;

import com.usts.salarymanage.mapper.TblCareerDao;
import com.usts.salarymanage.mapper.TblDepartmentDao;
import com.usts.salarymanage.model.TblCareer;
import com.usts.salarymanage.model.TblDepartment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CareerImpl {

    @Resource
    TblCareerDao tblCareerDao;

    public List<TblCareer> findAll() {
        return tblCareerDao.findAll();
    }

    public int insert(TblCareer tblCareer) {
        return tblCareerDao.insert(tblCareer);
    }

}
