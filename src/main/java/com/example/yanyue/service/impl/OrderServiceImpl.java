package com.example.yanyue.service.impl;

import com.example.yanyue.dao.OrderDao;
import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.vo.OrderVO;
import com.example.yanyue.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<OrderVO> getAll(Integer currentPage,Integer pageSize,Order order) {
        List<OrderVO> orderVOS=orderDao.getAll(currentPage,pageSize,order);
        if(orderVOS==null||orderVOS.size()==0){
            return new ArrayList<>();
        }
        return orderVOS;
    }

    @Override
    public int update(Order order) {
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        }else{
            return orderDao.updateByPrimaryKeySelective(order);
        }
    }

    @Override
    public int delete(Order order) {
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        } else{
            order.setStatus("已关闭");
            return orderDao.updateByPrimaryKeySelective(order);
        }
    }

    @Override
    public int insert(Order order) {
        if(order==null){
            return -2;
        }else{
            return orderDao.insertSelective(order);
        }
    }
}
