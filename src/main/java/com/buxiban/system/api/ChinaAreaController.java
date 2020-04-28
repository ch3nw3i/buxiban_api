package com.buxiban.system.api;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.buxiban.system.entity.ChinaCity;
import com.buxiban.system.entity.ChinaProvince;
import com.buxiban.system.entity.vo.ChinaCityVo;
import com.buxiban.system.mapper.ChinaProvinceMapper;
import com.buxiban.system.service.ChinaCityService;
import com.buxiban.system.service.ChinaCountyService;
import com.buxiban.system.service.ChinaProvinceService;
import com.buxiban.system.service.ChinaRegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package: com.buxiban.system.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:49
 */
@RestController
@RequestMapping("/api/china")
@Api(value = "ChinaAreaController", tags = "中国行政区划")
public class ChinaAreaController {
    @Autowired
    private ChinaProvinceService chinaProvinceService;
    @Autowired
    private ChinaProvinceMapper chinaProvinceMapper;
    @Autowired
    private ChinaCityService chinaCityService;
    @Autowired
    private ChinaCountyService chinaCountyService;
    @Autowired
    private ChinaRegionService chinaRegionService;

    @ApiOperation("获取province列表")
    @GetMapping("/province/list")
    public ResponseEntity<List<ChinaProvince>> listProvince() {
        List<ChinaProvince> list = chinaProvinceService.list();
        return ResponseEntity.ok(list);
    }

    @ApiOperation("根据province id获取city列表")
    @GetMapping("/city/listByProvinceId")
    public ResponseEntity<List<ChinaCity>> listCityByProvinceId(@RequestParam Long provinceId) {
        QueryWrapper<ChinaCity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ChinaCity::getProvinceId, provinceId);
        List<ChinaCity> list = chinaCityService.list(queryWrapper);
        return ResponseEntity.ok(list);
    }


}
