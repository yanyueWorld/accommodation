package com.example.yanyue.controller;

import com.example.yanyue.pojo.ApartmentClass;
import com.example.yanyue.service.AppartmentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/appartmentClass")
public class AppartmentClassController {

    @Autowired
    private AppartmentClassService appartmentClassService;
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public List<ApartmentClass> getAll(ApartmentClass apartmentClass){
        return appartmentClassService.getAll(apartmentClass);
    }
}
