package com.byh.singer.service;

import com.byh.singer.pojo.Review;

import java.util.List;

public interface ReviewService extends CrudService<Review>{

    /**
     * 获得一个商品的所有评论
     * @param id 商品id
     * @return
     */
    List<Review> getReviewListByPid(int id);

}
