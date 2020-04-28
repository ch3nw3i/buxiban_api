package com.buxiban.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.system.entity.ChinaProvince;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.buxiban.system.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:39
 */
@Mapper
@Repository
public interface ChinaProvinceMapper extends BaseMapper<ChinaProvince> {
}
