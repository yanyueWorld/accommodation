package com.example.yanyue.service;

import com.example.yanyue.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void getAll(){
        System.out.println(orderService.getAll(1,5,null));

    }

    @Test
    public void insert(){
        Order order=new Order();
        order.setOrderId(3);
        order.setApartmentId(3);
        System.out.println(orderService.insert(order));
    }

    @Test
    public void delete(){
        Order order=new Order();
        order.setOrderId(3);
        System.out.println(orderService.delete(order));
    }

    @Test
    public void update(){
        Order order=new Order();
        order.setOrderId(3);
        order.setAccountId(3);
        System.out.println(orderService.update(order));
    }

    @Test
    public void getSumByYear(){
        System.out.println(orderService.getYears());
    }

    @Test
    public void getSumByMonth(){
        System.out.println(orderService.getSumByMonth(2019));
    }

    @Test
    public void getYear(){
        System.out.println(orderService.getYears());
    }
}