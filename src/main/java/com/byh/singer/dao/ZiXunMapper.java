package com.byh.singer.dao;

import com.byh.singer.pojo.ZiXun;
import com.byh.singer.pojo.ZiXunExample;
import java.util.List;

public interface ZiXunMapper extends CrudDao<ZiXun> {

    List<ZiXun> selectByExample(ZiXunExample example);

    /**
     * 资讯审核
     * @param zid
     */
    void shenhe(int zid);

}