package com.usts.salarymanage.service.impl;

import com.usts.salarymanage.mapper.WareDao;
import com.usts.salarymanage.model.Ware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class WareServiceImpl {

    @Resource
    WareDao wareDao;

    public void insert(Ware ware) {
        wareDao.insert(ware);
    }

    public List<Ware> select() {
        return wareDao.findAll();
    }

}
