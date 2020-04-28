package com.buxiban.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.system.entity.ChinaCity;
import com.buxiban.system.entity.vo.ChinaCityVo;
import com.buxiban.system.mapper.ChinaCityMapper;
import com.buxiban.system.service.ChinaCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.buxiban.system.service.impl
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:48
 */
@Service
public class ChinaCityServiceImpl extends ServiceImpl<ChinaCityMapper, ChinaCity> implements ChinaCityService {
}
