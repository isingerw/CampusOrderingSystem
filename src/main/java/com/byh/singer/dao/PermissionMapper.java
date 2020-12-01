package com.byh.singer.dao;

import com.byh.singer.pojo.Permission;
import com.byh.singer.pojo.PermissionExample;
import java.util.List;

public interface PermissionMapper extends SysDao<Permission>{

    List<Permission> selectByExample(PermissionExample example);

}