package com.buxiban.system.service.impl;

import com.buxiban.system.entity.SysRole;
import com.buxiban.system.mapper.SysRoleMapper;
import com.buxiban.system.service.SysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysRole selectRoleById(Integer id) {
        return sysRoleMapper.selectRoleById(id);
    }
}
