package com.buxiban.user.service.impl;

import com.buxiban.user.entity.User;
import com.buxiban.user.mapper.UserMapper;
import com.buxiban.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
