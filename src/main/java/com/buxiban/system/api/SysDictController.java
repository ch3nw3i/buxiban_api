package com.buxiban.system.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buxiban.system.entity.SysDict;
import com.buxiban.system.entity.SysDictDetail;
import com.buxiban.system.service.SysDictDetailService;
import com.buxiban.system.service.SysDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.buxiban.system.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 1:03
 */
@RestController
@RequestMapping("/system/dicts")
@Api(value = "SysDictController", tags = "字典管理")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @Autowired
    private SysDictDetailService sysDictDetailService;

    @ApiOperation("获取所有字典组及其描述")
    @GetMapping("")
//    @RequiresRoles("admin")
//    @RequiresPermissions("select")
    public ResponseEntity<List<SysDict>> listAll() {
        return ResponseEntity.ok(sysDictService.list());
    }

    @ApiOperation("根据group id查询该字典组下所有键值对")
    @GetMapping("/{groupId}/details")
    public ResponseEntity<List<SysDictDetail>> listSysDictDetailByGroupId(@PathVariable("groupId") Integer groupId) {
        // TODO 500 syntax error
        return null;
//        QueryWrapper<SysDictDetail> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(SysDictDetail::getGroupId, groupId);
//        List<SysDictDetail> list = sysDictDetailService.list(queryWrapper);
//        if (list == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(list);
//        SysDict sysDict = sysDictService.selectDetailByDictId(groupId);
//        if (sysDict == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(sysDict);
    }
}
