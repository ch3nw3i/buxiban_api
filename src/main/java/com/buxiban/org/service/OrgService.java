package com.buxiban.org.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.Org;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.buxiban.org.service
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:25
 */

public interface OrgService extends IService<Org> {

    /**
     * 设置布尔类型的属性
     * @return
     */
    public boolean setBoolean(BooleanPropertySetter setter);
}
