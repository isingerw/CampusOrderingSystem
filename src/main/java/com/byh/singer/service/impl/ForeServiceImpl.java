package com.byh.singer.service.impl;

import com.byh.singer.dao.CategoryMapper;
import com.byh.singer.dao.ProductMapper;
import com.byh.singer.pojo.Category;
import com.byh.singer.pojo.CategoryExample;
import com.byh.singer.pojo.Product;
import com.byh.singer.service.ForeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeServiceImpl implements ForeService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Category> listToThree() {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andIdBetween(1,4); //从1开始计数
        List<Category> categories = categoryMapper.selectByExample(example);
        return categories;
    }

    @Override
    public List<Product> getFivePro() {
        return productMapper.randFive();
    }


}
