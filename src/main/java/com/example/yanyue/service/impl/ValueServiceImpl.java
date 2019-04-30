package com.example.yanyue.service.impl;

import com.example.yanyue.dao.ValueDao;
import com.example.yanyue.pojo.Value;
import com.example.yanyue.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ValueServiceImpl implements ValueService {
    @Autowired
    private ValueDao valueDao;

    @Override
    public List<Value> getValuesByAttrId(Integer attrId) {
        List<Value> values=new ArrayList<>();
        if(attrId==null||attrId==0){
            return values;
        }else{
            values=valueDao.getValuesByAttrId(attrId);
            if(values==null||values.size()==0){
                return new ArrayList<>();
            }else{
                return values;
            }
        }
    }
}
