package com.atguigu.service;

import com.atguigu.pojo.Cart;

/**
 * @author Sun_yk
 * @create 2020-12-27 16:08
 */
public interface OrderService {
    public String createOrder(Cart cart, Integer userId);
}
