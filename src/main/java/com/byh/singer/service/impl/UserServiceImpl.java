package com.byh.singer.service.impl;

import com.byh.singer.dao.ProductMapper;
import com.byh.singer.dao.UserMapper;
import com.byh.singer.pojo.Product;
import com.byh.singer.pojo.User;
import com.byh.singer.pojo.UserExample;
import com.byh.singer.service.UserRoleService;
import com.byh.singer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleService userRoleService;
    @Autowired
    ProductMapper productMapper;

    @Override
    public String getPassword(String name) {
        User u = getByName(name);
        if (null == u) return null;
        return u.getPassword();
    }

    @Override
    public User getByName(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty()) return null;
        return users.get(0);
    }

    @Override
    public List<User> list() {

        return userMapper.selectByExample(null);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.deleteByPrimaryKey(id);
        userRoleService.deleteByUser(id);
    }

    @Override
    public User get(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public String enableStatus(String name) {
        userMapper.enableStatus(name);
        return "success";
    }

    @Override
    public String stopStatus(String name) {
        userMapper.stopStatus(name);
        return "success";
    }

    @Override
    public User getUserByPid(int id) {
        Product product = productMapper.selectByPrimaryKey(id);
        User user = userMapper.selectByPrimaryKey(product.getBid());
        return user;
    }


}