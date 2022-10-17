package com.zjn.order.service.impl;

import com.zjn.order.mapper.OrderMapper;
import com.zjn.order.pojo.Order;
import com.zjn.order.pojo.User;
import com.zjn.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zjn
 * @date 2022/10/16 上午11:14
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private RestTemplate restTemplate;
    /**
     * Get by id
     *
     * @param orderId
     * @return
     */
    @Override
    public Order findById(Long orderId) {
        Order order = orderMapper.findById(orderId);

        String url = "http://userservice/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);
        order.setUser(user);
        System.out.println("order = " + order);
        return order;
    }
}
