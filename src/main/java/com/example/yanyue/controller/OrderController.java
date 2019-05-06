package com.example.yanyue.controller;

import com.example.yanyue.pojo.Order;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.OrderVO;
import com.example.yanyue.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public Result<List<OrderVO>> getAll(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,@RequestBody Order order){
        List<OrderVO> orderVOS=orderService.getAll(currentPage,pageSize,order);
        if(orderVOS==null||orderVOS.size()==0){
            orderVOS=new ArrayList<>();
        }
        Result<List<OrderVO>> result = Result.success(orderVOS);
        PageInfo<OrderVO> pageInfo = new PageInfo<>(orderVOS);
        result.setCount(pageInfo.getTotal());
        return result;
    }

    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int add(@RequestBody Order order){
        if(order==null) {
            return -2;
        }else{
            return orderService.insert(order);
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int update(@RequestBody Order order){
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        }else{
            return orderService.update(order);
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    @CrossOrigin
    public int delete(@RequestBody  Order order){
        if(order==null||order.getOrderId()==null||order.getOrderId()==0){
            return -2;
        }else{
            return orderService.delete(order);
        }
    }
}
