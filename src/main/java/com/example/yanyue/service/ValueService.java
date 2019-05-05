package com.example.yanyue.service;

import com.example.yanyue.pojo.Value;

import java.util.List;

public interface ValueService {
    List<Value> getValuesByAttrId(Integer attrId);

    List<Value> getAll();
}
