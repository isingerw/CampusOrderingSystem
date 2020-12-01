package com.byh.singer.dao;

import com.byh.singer.pojo.RolePermission;
import com.byh.singer.pojo.RolePermissionExample;
import java.util.List;

public interface RolePermissionMapper extends SysDao<RolePermission>{

    List<RolePermission> selectByExample(RolePermissionExample example);

}