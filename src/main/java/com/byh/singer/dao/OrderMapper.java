package com.byh.singer.dao;

import com.byh.singer.pojo.Order;
import com.byh.singer.pojo.OrderExample;
import java.util.List;

public interface OrderMapper extends CrudDao<Order>{

    List<Order> selectByExample(OrderExample example);

}