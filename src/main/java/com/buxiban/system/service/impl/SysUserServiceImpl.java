package com.buxiban.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buxiban.system.entity.*;
import com.buxiban.system.mapper.SysPermissionMapper;
import com.buxiban.system.mapper.SysRoleMapper;
import com.buxiban.system.mapper.SysUserMapper;
import com.buxiban.system.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 管理员信息表

自定义网站管理者的角色与权限 服务实现类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

//    @Autowired
//    private SysPermissionMapper sysPermissionMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysUser getSysUserByUsername(String username) {
        SysUser sysUser = sysUserMapper.getSysUserByUsername(username);
        for (SysRole r : sysUser.getRoles()) {
            SysRole sysRole = sysRoleMapper.selectRoleById(r.getId());
            r.setPermissions(sysRole.getPermissions());
        }
        return sysUser;
    }

    @Override
    public SysUser login(String username) {
        SysUser sysUser = sysUserMapper.getSysUserByUsername(username);
        for (SysRole r : sysUser.getRoles()) {
            SysRole sysRole = sysRoleMapper.selectRoleById(r.getId());
            r.setPermissions(sysRole.getPermissions());
        }
        return sysUser;
    }
}
