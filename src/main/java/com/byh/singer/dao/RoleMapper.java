package com.byh.singer.dao;

import com.byh.singer.pojo.Role;
import com.byh.singer.pojo.RoleExample;
import java.util.List;

public interface RoleMapper extends SysDao<Role> {

    List<Role> selectByExample(RoleExample example);

}