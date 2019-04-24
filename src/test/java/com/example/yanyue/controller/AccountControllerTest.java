package com.example.yanyue.controller;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.vo.AccountPowerVO;
import com.example.yanyue.pojo.vo.AccountVO;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        System.out.println("mockMvc构造成功");
    }

    @Test
    public void fidndAllCustomers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/account/getAccountsByExample").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("page","1").param("limit","10").param("roleId","3").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getAccountByAccountId() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/account/getAccountByAccountId").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("accountId","1").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk()).
                andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.post("/account/modify").contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("accountId","1").param("gender","男").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

}