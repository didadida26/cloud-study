package com.zjn.order.controller;

import com.zjn.order.pojo.Order;
import com.zjn.order.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zjn
 * @date 2022/10/16 上午11:12
 */
@Controller
@RequestMapping("/order")
@ResponseBody
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/{id}}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id);
    }
}
