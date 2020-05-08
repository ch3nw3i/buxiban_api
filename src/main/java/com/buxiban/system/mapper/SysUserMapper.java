package com.buxiban.system.mapper;

import com.buxiban.system.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * 管理员信息表

自定义网站管理者的角色与权限 Mapper 接口
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
    SysUser getSysUserByUsername(@Param("username") String username);
}
