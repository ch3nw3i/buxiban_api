package com.buxiban.system.service.impl;

import com.buxiban.system.entity.SysPermission;
import com.buxiban.system.mapper.SysPermissionMapper;
import com.buxiban.system.service.SysPermissionService;
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
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public SysPermission selectById(Integer id) {
        return sysPermissionMapper.selectById(id);
    }
}
