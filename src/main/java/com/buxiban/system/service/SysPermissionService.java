package com.buxiban.system.service;

import com.buxiban.system.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
public interface SysPermissionService extends IService<SysPermission> {

    SysPermission selectById(Integer id);
}
