package com.buxiban.system.service;

import com.buxiban.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 管理员信息表

自定义网站管理者的角色与权限 服务类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getSysUserByUsername(String username);

    SysUser login(String username);
}
