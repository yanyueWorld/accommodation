package com.example.yanyue.service.impl;

import com.example.yanyue.dao.ApartmentClassDao;
import com.example.yanyue.pojo.ApartmentClass;
import com.example.yanyue.service.AppartmentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppartmentClassServiceImpl implements AppartmentClassService {

    @Autowired
    ApartmentClassDao apartmentClassDao;
    @Override
    public List<ApartmentClass> getAll(ApartmentClass apartmentClass) {
        List<ApartmentClass> apartmentClasses=apartmentClassDao.getAll(apartmentClass);
        if(apartmentClasses==null||apartmentClasses.size()==0){
            return new ArrayList<>();
        }else{
            return apartmentClasses;
        }
    }
}
