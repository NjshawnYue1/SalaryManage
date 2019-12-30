package com.usts.salarymanage.service.impl;

import com.usts.salarymanage.mapper.TblDepartmentDao;
import com.usts.salarymanage.model.TblDepartment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class DepartmentImpl {

    @Resource
    TblDepartmentDao tblDepartmentDao;

    public List<TblDepartment> findAll() {
        return tblDepartmentDao.findAll();
    }

    public int insert(TblDepartment tblDepartment) {
        return tblDepartmentDao.insert(tblDepartment);
    }

}
