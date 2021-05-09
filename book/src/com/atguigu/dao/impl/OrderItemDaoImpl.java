package com.atguigu.dao.impl;

import com.atguigu.dao.OrderItemDao;
import com.atguigu.pojo.OrderItem;

/**
 * @author Sun_yk
 * @create 2020-12-27 15:49
 */
public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {

    @Override
    public int saveOrderItem(OrderItem orderItem) {

        String sql = "insert into t_order_item(`name`,`count`,`price`,`total_price`,`order_id`) values(?,?,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());

    }
}
