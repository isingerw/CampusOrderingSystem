package com.byh.singer.dao;

import com.byh.singer.pojo.OrderItem;
import com.byh.singer.pojo.OrderItemExample;
import java.util.List;

public interface OrderItemMapper extends CrudDao<OrderItem>{

    List<OrderItem> selectByExample(OrderItemExample example);

}