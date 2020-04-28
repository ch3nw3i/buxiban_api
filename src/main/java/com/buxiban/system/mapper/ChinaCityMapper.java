package com.buxiban.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.system.entity.ChinaCity;
import com.buxiban.system.entity.vo.ChinaCityVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.buxiban.system.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:40
 */
@Mapper
public interface ChinaCityMapper extends BaseMapper<ChinaCity> {
}
