package com.buxiban.system.mapper;

import com.buxiban.system.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
public interface SysRoleMapper extends BaseMapper<SysRole> {

    SysRole selectRoleById(@Param("id") Integer id);
}
