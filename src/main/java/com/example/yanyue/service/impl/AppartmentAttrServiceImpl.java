package com.example.yanyue.service.impl;

import com.example.yanyue.dao.ApartmentAttrDao;
import com.example.yanyue.pojo.ApartmentAttr;
import com.example.yanyue.service.AppartmentAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppartmentAttrServiceImpl implements AppartmentAttrService {
    @Autowired
    private ApartmentAttrDao apartmentAttrDao;
    @Override
    public List<ApartmentAttr> getAll(ApartmentAttr apartmentAttr) {
        return apartmentAttrDao.getAll(apartmentAttr);
    }
}
