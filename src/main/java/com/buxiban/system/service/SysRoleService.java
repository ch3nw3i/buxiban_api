package com.buxiban.system.service;

import com.buxiban.system.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
public interface SysRoleService extends IService<SysRole> {

    SysRole selectRoleById(Integer id);
}
