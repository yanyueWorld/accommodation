package com.example.yanyue.controller;


import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;
import com.google.gson.Gson;
import com.sun.java.swing.plaf.motif.MotifEditorPaneUI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        System.out.println("mockMvc构造成功");
    }

    @Test
    public void getAppartmentByExample() throws Exception {
        AppartmentVO appartmentVO=new AppartmentVO();
        String json=new Gson().toJson(appartmentVO);
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/getAppartmentByExample").contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("page","1").param("limit","10").content(json).accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception{
        AppartmentVO appartmentVO=new AppartmentVO();
        appartmentVO.setAppartmentId(1);
        appartmentVO.setPrice(new BigDecimal(2));
        String json=new Gson().toJson(appartmentVO);
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/update").contentType(MediaType.APPLICATION_JSON_UTF8)
        .content(json)
        .accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void deleteByPrimaryKey() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/deleteByPrimaryKey").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("appartmentId","3").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print());
    }

  

    @Test
    public void getInfoByAppartmentId() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/getInfoByAppartmentId").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("appartmentId",new String()).accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/getInfoByAppartmentId").contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("appartmentId","1").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}