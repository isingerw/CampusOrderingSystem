package com.byh.singer.dao;

import com.byh.singer.pojo.UserRole;
import com.byh.singer.pojo.UserRoleExample;
import java.util.List;

public interface UserRoleMapper extends SysDao<UserRole>{

    List<UserRole> selectByExample(UserRoleExample example);

}