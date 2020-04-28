package com.buxiban.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.system.entity.SysDict;
import com.buxiban.system.entity.SysDictWithDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Package: com.buxiban.system.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 0:59
 */
@Mapper
public interface SysDictMapper extends BaseMapper<SysDict> {
    List<SysDictWithDetail> selectDictGroupWithDetail(Integer id);
}
