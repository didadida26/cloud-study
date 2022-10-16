package com.zjn.order.controller;

import com.zjn.order.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author zjn
 * @date 2022/10/16 上午11:25
 */
@SpringBootTest
class OrderControllerTest {
    @Resource
    private OrderController orderController;

    @Test
    void findById() {
        Order order = orderController.findById(103L);
        System.out.println("order = " + order);
    }
}