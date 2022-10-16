package com.zjn.order.service.impl;

import com.zjn.order.mapper.OrderMapper;
import com.zjn.order.pojo.Order;
import com.zjn.order.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zjn
 * @date 2022/10/16 上午11:14
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    /**
     * Get by id
     *
     * @param id
     * @return
     */
    @Override
    public Order findById(Long id) {
        Order order = orderMapper.findById(id);
        System.out.println("order = " + order);
        return order;
    }
}
