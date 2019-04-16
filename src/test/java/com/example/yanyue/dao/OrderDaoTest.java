package com.example.yanyue.dao;


import com.example.yanyue.pojo.Order;
import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void getAll(){
        System.out.println(orderDao.getAll(null));
        Order order=new Order();
        order.setStatus(3);
        System.out.println(orderDao.getAll(order));
    }

    @Test
    public void insert(){
        Order order=new Order();
        order.setApartmentId(2);
        System.out.println(orderDao.insertSelective(order));
    }

    @Test
    public void update(){
        Order order=new Order();
        order.setOrderId(2);
        order.setAccountId(2);
        System.out.println(orderDao.updateByPrimaryKeySelective(order));

    }

    @Test
    public void delete(){
        System.out.println(orderDao.deleteByPrimaryKey(2));
    }
}