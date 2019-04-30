package com.example.yanyue.controller;

import com.example.yanyue.pojo.Value;
import com.example.yanyue.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/value")
public class ValueController {
    @Autowired
    private ValueService valueService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getValues")
    public List<Value> getValuesByAttrId(Integer attrId){
        if(attrId==null||attrId==0){
            return  new ArrayList<>();
        }else{
            List<Value> values=valueService.getValuesByAttrId(attrId);
            if(values==null||values.size()==0){
                return new ArrayList<>();
            }else{
                return values;
            }
        }
    }
}
