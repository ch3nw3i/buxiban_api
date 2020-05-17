package com.buxiban.org.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.org.entity.OrgUser;
import com.buxiban.org.mapper.OrgUserMapper;
import com.buxiban.org.service.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.buxiban.org.service.impl
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:53
 */
@Service
public class OrgUserServiceImpl extends ServiceImpl<OrgUserMapper, OrgUser> implements OrgUserService {

    @Autowired
    private OrgUserMapper orgUserMapper;


}
