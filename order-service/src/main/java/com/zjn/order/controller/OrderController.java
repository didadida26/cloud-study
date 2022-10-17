package com.zjn.order.controller;

import com.zjn.order.pojo.Order;
import com.zjn.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zjn
 * @date 2022/10/16 上午11:12
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public Order findById(@PathVariable("orderId") Long orderId) {
        return orderService.findById(orderId);
    }
}
