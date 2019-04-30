package com.example.yanyue.service;

import com.example.yanyue.dao.AppartmentTypeDao;
import com.example.yanyue.pojo.AppartmentType;

import java.util.List;

public interface AppartmentTypeService {
    List<AppartmentType> getAll(AppartmentType appartmentType);
}
