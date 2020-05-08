package com.buxiban.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.system.entity.SysDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.buxiban.system.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 0:59
 */
@Mapper
@Repository
public interface SysDictMapper extends BaseMapper<SysDict> {

    SysDict selectDetailByDictId(@Param("id") Integer id);
}
