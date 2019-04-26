package com.example.yanyue.controller;


import com.example.yanyue.pojo.vo.AppartmentVO;
import com.google.gson.Gson;
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
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/update").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("apartmentId","1").param("typeId","2")
        .accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void deleteByPrimaryKey() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/deleteByPrimaryKey").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("appartmentId","4").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void insert() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/appartment/insert").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("apartmentName","4").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}