package com.buxiban.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buxiban.system.entity.SysDict;

import java.util.List;

/**
 * @Package: com.buxiban.system.service
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 1:00
 */
public interface SysDictService extends IService<SysDict> {

    SysDict selectDetailByDictId(Integer id);
}
