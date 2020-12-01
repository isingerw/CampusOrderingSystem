package com.byh.singer.dao;

import com.byh.singer.pojo.Customer;
import com.byh.singer.pojo.CustomerExample;
import java.util.List;

public interface CustomerMapper extends CrudDao<Customer>{

    List<Customer> selectByExample(CustomerExample example);

    /**
     * 开启用户会员状态
     * @param id
     */
    void enableStatus(int id);

}