package com.byh.singer.dao;

import com.byh.singer.pojo.Review;
import com.byh.singer.pojo.ReviewExample;
import java.util.List;

public interface ReviewMapper extends CrudDao<Review>{

    List<Review> selectByExample(ReviewExample example);

}