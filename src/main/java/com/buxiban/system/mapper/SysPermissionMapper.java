package com.buxiban.system.mapper;

import com.buxiban.system.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@Mapper
@Repository
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    SysPermission selectById(Integer id);

//    List<SysPermission> selectByRoleId(Integer role_id);
}
