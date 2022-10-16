package com.zjn.order.mapper;

import com.zjn.order.pojo.Order;

/**
 * @author zjn
 * @date 2022/10/16 上午11:07
 */
public interface OrderMapper {
    /**
     * 根据id查找
     * @param id
     * @return
     */
    Order findById(Long id);
}
