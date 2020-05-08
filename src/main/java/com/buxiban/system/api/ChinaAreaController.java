package com.buxiban.system.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buxiban.system.entity.ChinaCity;
import com.buxiban.system.entity.ChinaCounty;
import com.buxiban.system.entity.ChinaProvince;
import com.buxiban.system.entity.ChinaTown;
import com.buxiban.system.service.ChinaCityService;
import com.buxiban.system.service.ChinaCountyService;
import com.buxiban.system.service.ChinaProvinceService;
import com.buxiban.system.service.ChinaTownService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * province - city - county - town
 * 省/自治区/直辖市 - 市 - 区/县 - 乡/镇/街道
 * @Package: com.buxiban.system.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:49
 */
@RestController
@RequestMapping("/china")
@Api(value = "ChinaAreaController", tags = "中国行政区划")
public class ChinaAreaController {
    @Autowired
    private ChinaProvinceService chinaProvinceService;
    @Autowired
    private ChinaCityService chinaCityService;
    @Autowired
    private ChinaCountyService chinaCountyService;
    @Autowired
    private ChinaTownService chinaTownService;

    @ApiOperation("获取province列表")
    @GetMapping("/province")
    public ResponseEntity<List<ChinaProvince>> listProvince() {
        List<ChinaProvince> list = chinaProvinceService.list();
        return ResponseEntity.ok(list);
    }

    @ApiOperation("根据province id精确查询city列表")
    @GetMapping("/province/{provinceId}")
    public ResponseEntity<List<ChinaCity>> listCityByProvinceId(@PathVariable("provinceId") Long provinceId) {
        QueryWrapper<ChinaCity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ChinaCity::getProvinceId, provinceId);
        List<ChinaCity> list = chinaCityService.list(queryWrapper);
        return ResponseEntity.ok(list);
    }

//    @ApiOperation("根据province name模糊查询city列表")
//    @GetMapping("/province/search/provinceName/{provinceName}")
//    public ResponseEntity<List<ChinaCity>> listCityByProvinceName(@PathVariable("provinceName") String provinceName) {
//        QueryWrapper<ChinaCity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().like(ChinaCity::getProvinceName, provinceName);
//        List<ChinaCity> list = chinaCityService.list(queryWrapper);
//        return ResponseEntity.ok(list);
//    }

    @ApiOperation("根据city id精确查询county列表")
    @GetMapping("/city/{cityId}")
    public ResponseEntity<List<ChinaCounty>> listCountyByCountyId(@PathVariable("cityId") Long cityId) {
        QueryWrapper<ChinaCounty> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ChinaCounty::getCityId, cityId);
        List<ChinaCounty> list = chinaCountyService.list(queryWrapper);
        return ResponseEntity.ok(list);
    }

//    @ApiOperation("根据city name模糊查询county列表")
//    @GetMapping("/city/name/{cityName}/county")
//    public ResponseEntity<List<ChinaCounty>> listCityByCountyName(@PathVariable("cityName") String cityName) {
//        QueryWrapper<ChinaCounty> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().like(ChinaCounty::getCityName, cityName);
//        List<ChinaCounty> list = chinaCountyService.list(queryWrapper);
//        return ResponseEntity.ok(list);
//    }
//

    @ApiOperation("根据county id精确查询town列表")
    @GetMapping("/county/{countyId}")
    public ResponseEntity<List<ChinaTown>> listTownByTownId(@PathVariable("countyId") Long countyId) {
        QueryWrapper<ChinaTown> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ChinaTown::getCountyId, countyId);
        List<ChinaTown> list = chinaTownService.list(queryWrapper);
        return ResponseEntity.ok(list);
    }

//    @ApiOperation("根据county name模糊查询town列表")
//    @GetMapping("/county/name/{countyName}/town")
//    public ResponseEntity<List<ChinaTown>> listTownByTownName(@PathVariable("countyName") String countyName) {
//        QueryWrapper<ChinaTown> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().like(ChinaTown::getCountyName, countyName);
//        List<ChinaTown> list = chinaTownService.list(queryWrapper);
//        return ResponseEntity.ok(list);
//    }

}
