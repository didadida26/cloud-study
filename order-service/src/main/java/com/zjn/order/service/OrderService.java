package com.zjn.order.service;

import com.zjn.order.pojo.Order;

/**
 * @author zjn
 * @date 2022/10/16 上午11:13
 */
public interface OrderService {
    /**
     * Get by id
     * @param id
     * @return
     */
    Order findById(Long id);
}
