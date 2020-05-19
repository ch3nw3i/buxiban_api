package com.buxiban.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.system.entity.UpdateLog;
import com.buxiban.system.mapper.UpdateLogMapper;
import com.buxiban.system.service.UpdateLogService;
import org.springframework.stereotype.Service;

/**
 * @Package: com.buxiban.system.service.impl
 * @Author: ch3nw3i@github
 * @Date: 2020-05-19 22:10
 */
@Service
public class UpdateLogServiceImpl extends ServiceImpl<UpdateLogMapper, UpdateLog> implements UpdateLogService {
}
