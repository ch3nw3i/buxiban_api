package com.buxiban.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buxiban.system.entity.SysDict;
import com.buxiban.system.entity.SysDictWithDetail;
import com.buxiban.system.mapper.SysDictMapper;
import com.buxiban.system.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.buxiban.system.service.impl
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 1:01
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements SysDictService {

    @Autowired
    private SysDictService sysDictService;

    @Override
    public List<SysDictWithDetail> selectDictGroupWithDetail(Integer id) {
        return sysDictService.selectDictGroupWithDetail(id);
    }
}
