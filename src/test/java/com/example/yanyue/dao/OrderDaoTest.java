package com.example.yanyue.dao;

import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void getAll(){
        System.out.println(orderDao.getAll(1,5,null));
        System.out.println(orderDao.getAll(1,5,new Order()));
    }

    @Test
    public void insert(){
        Order order=new Order();
        order.setAccountId(1);
        order.setApartmentId(1);
        order.setStatus("已完成");
        System.out.println(orderDao.insertSelective(order));
    }

    @Test
    public void update(){
        Order order=new Order();
        order.setOrderId(16);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=simpleDateFormat.parse("2019-01-01");
            order.setCheckInDate(date);
            System.out.println(orderDao.updateByPrimaryKeySelective(order));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete(){
        Order order=new Order();
        order.setOrderId(16);
        order.setStatus("已关闭");
        System.out.println(orderDao.updateByPrimaryKeySelective(order));
    }

}