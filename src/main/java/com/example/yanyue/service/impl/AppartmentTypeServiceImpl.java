package com.example.yanyue.service.impl;

import com.example.yanyue.dao.AppartmentTypeDao;
import com.example.yanyue.pojo.AppartmentType;
import com.example.yanyue.service.AppartmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppartmentTypeServiceImpl implements AppartmentTypeService {

    @Autowired
    AppartmentTypeDao appartmentTypeDao;
    @Override
    public List<AppartmentType> getAll(AppartmentType appartmentType) {
        List<AppartmentType> appartmentTypes=appartmentTypeDao.getAll(appartmentType);
        if(appartmentTypes==null||appartmentTypes.size()==0){
            return new ArrayList<>();
        }else{
            return appartmentTypes;
        }
    }
}
