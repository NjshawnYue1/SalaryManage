package com.usts.salarymanage.mapper;

import com.usts.salarymanage.model.Ware;

import java.util.List;

public interface WareDao {

    void insert(Ware ware);

    List<Ware> findAll();

}
