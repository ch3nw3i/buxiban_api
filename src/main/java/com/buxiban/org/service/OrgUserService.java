package com.buxiban.org.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.OrgUser;

/**
 * @Package: com.buxiban.org.service
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:40
 */
public interface OrgUserService extends IService<OrgUser> {

    /**
     * 设置布尔类型的属性
     * @return
     */
    public boolean setBoolean(BooleanPropertySetter setter);

}
