package com.buxiban.system.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buxiban.system.entity.SysDict;
import com.buxiban.system.entity.SysDictDetail;
import com.buxiban.system.service.SysDictDetailService;
import com.buxiban.system.service.SysDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.buxiban.system.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 1:03
 */
@RestController
@RequestMapping("/api/sys")
@Api(value = "SysDictController", tags = "系统字典")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @Autowired
    private SysDictDetailService sysDictDetailService;

    @ApiOperation("获取所有字典组及其描述")
    @GetMapping("/dict/listAll")
    public ResponseEntity<List<SysDict>> list() {
        List<SysDict> list = sysDictService.list();
//        if (list == null || list.size() <= 0) {
//            return ResponseEntity.notFound().build();
//        } else {
            return ResponseEntity.ok(list);
//        }
    }

    @ApiOperation("根据group id查询该字典组下所有键值对")
    @GetMapping("/dict/detail/getByGroupId")
    public ResponseEntity<List<SysDictDetail>> listSysDictDetailByGroupId(@RequestParam Integer groupId) {
        QueryWrapper<SysDictDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysDictDetail::getGroupId, groupId);
        List<SysDictDetail> list = sysDictDetailService.list(queryWrapper);
        return ResponseEntity.ok(list);
//        return null;
    }
}
