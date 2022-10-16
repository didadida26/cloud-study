package com.zjn.order.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @author zjn
 * @TableName tb_order
 */
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品数量
     */
    private Integer num;

    private static final long serialVersionUID = 1L;


}