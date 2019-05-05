package com.example.yanyue.controller;

import com.example.yanyue.pojo.AppartmentType;
import com.example.yanyue.service.AppartmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appartmentType")
public class AppartmentTypeController {

    @Autowired
    AppartmentTypeService appartmentTypeService;
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<AppartmentType> getAll(AppartmentType appartmentType){
        return appartmentTypeService.getAll(appartmentType);

    }
}
