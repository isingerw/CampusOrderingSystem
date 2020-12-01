package com.byh.singer.service.impl;


import com.byh.singer.dao.RolePermissionMapper;
import com.byh.singer.pojo.Role;
import com.byh.singer.pojo.RolePermission;
import com.byh.singer.pojo.RolePermissionExample;
import com.byh.singer.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @Override
    public void setPermissions(Role role, long[] permissionIds) {
        //删除当前角色所有的权限
        RolePermissionExample example= new RolePermissionExample();
        example.createCriteria().andRidEqualTo(role.getId());
        List<RolePermission> rps= rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());

        //设置新的权限关系
        if(null!=permissionIds)
            for (long pid : permissionIds) {
                RolePermission rolePermission = new RolePermission();
                rolePermission.setPid(pid);
                rolePermission.setRid(role.getId());
                rolePermissionMapper.insert(rolePermission);
            }
    }

    @Override
    public void deleteByRole(long roleId) {
        RolePermissionExample example= new RolePermissionExample();
        example.createCriteria().andRidEqualTo(roleId);
        List<RolePermission> rps= rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());
    }

    @Override
    public void deleteByPermission(long permissionId) {
        RolePermissionExample example= new RolePermissionExample();
        example.createCriteria().andPidEqualTo(permissionId);
        List<RolePermission> rps= rolePermissionMapper.selectByExample(example);
        for (RolePermission rolePermission : rps)
            rolePermissionMapper.deleteByPrimaryKey(rolePermission.getId());
    }
}
