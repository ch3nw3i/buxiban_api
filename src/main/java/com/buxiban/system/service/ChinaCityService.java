package com.buxiban.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buxiban.system.entity.ChinaCity;
import com.buxiban.system.entity.ChinaProvince;
import com.buxiban.system.entity.vo.ChinaCityVo;

import java.util.List;

/**
 * @Package: com.buxiban.system.service
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:43
 */
public interface ChinaCityService extends IService<ChinaCity> {

    List<ChinaCityVo> selectCityListByProvinceId(Long provinceId);
}
