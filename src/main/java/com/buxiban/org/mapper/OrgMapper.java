package com.buxiban.org.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.Org;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.buxiban.org.mapper
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:22
 */
@Mapper
@Repository
public interface OrgMapper extends BaseMapper<Org> {

    /**
     * 设置布尔类型的属性
     * @param setter 布尔类型属性设置对象
     * @return
     */
    int setBoolean(@Param("setter") BooleanPropertySetter setter);
}
