package com.buxiban.org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.Org;
import com.buxiban.org.mapper.OrgMapper;
import com.buxiban.org.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.buxiban.org.service.impl
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:26
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, Org> implements OrgService {

    @Autowired
    private OrgMapper orgMapper;


    @Override
    public boolean setBoolean(BooleanPropertySetter setter) {
        return orgMapper.setBoolean(setter) == 1 ? true : false;
    }
}
