package com.byh.singer.dao;

import com.byh.singer.pojo.Category;
import com.byh.singer.pojo.CategoryExample;
import java.util.List;

public interface CategoryMapper extends CrudDao<Category>{

     List<Category> selectByExample(CategoryExample example);

}