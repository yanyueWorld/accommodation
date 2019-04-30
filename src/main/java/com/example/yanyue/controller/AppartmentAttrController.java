package com.example.yanyue.controller;

import com.example.yanyue.pojo.ApartmentAttr;
import com.example.yanyue.service.AppartmentAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appartmentAttr")
public class AppartmentAttrController {
    @Autowired
    private AppartmentAttrService appartmentAttrService;

    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<ApartmentAttr> getAll(ApartmentAttr apartmentAttr){
        List<ApartmentAttr> apartmentAttrs=appartmentAttrService.getAll(apartmentAttr);
        if(apartmentAttrs==null||apartmentAttrs.size()==0){
            return new ArrayList<>();
        }else{
            return apartmentAttrs;
        }
    }

}
