package com.buxiban.org.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buxiban.system.annotation.OperationLogDetail;
import com.buxiban.system.enums.OperationType;
import com.buxiban.system.enums.OperationUnit;
import com.buxiban.org.entity.OrgUser;
import com.buxiban.org.entity.dto.OrgUserDto;
import com.buxiban.org.service.OrgUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Package: com.buxiban.org.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:38
 */
@RestController
@Api(value = "OrgUserController", tags = "机构用户")
@RequestMapping("/org/user")
public class OrgUserController {

    @Autowired
    private OrgUserService orgUserService;

    @OperationLogDetail(detail = "通过机构用户id[{{id}}]获取机构用户信息",
            operationUnit = OperationUnit.ORG_USER, operationType = OperationType.SELECT)
    @GetMapping("/{id}")
    @ApiOperation("根据id获取机构用户")
    public ResponseEntity<OrgUser> get(@PathVariable("id") Integer id) {
        OrgUser orgUser = orgUserService.getById(id);
        if (orgUser == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(orgUser);
    }

    @OperationLogDetail(detail = "分页查询机构用户  ",
            operationUnit = OperationUnit.ORG_USER, operationType = OperationType.SELECT)
    @GetMapping("search")
    @ApiOperation("机构用户 分页查询 列表")
    public ResponseEntity list(@RequestParam("current") Integer current, @RequestParam("size") Integer size) {
        Page<OrgUser> page = new Page<>(current, size);
        IPage<OrgUser> orgUserIPage = orgUserService.page(page);
        return ResponseEntity.ok(orgUserIPage);
    }

    @PostMapping("")
    @ApiOperation("创建机构用户")
    public ResponseEntity add(@RequestBody OrgUserDto orgUserDto) {
        OrgUser orgUser = new OrgUser();
        BeanUtil.copyProperties(orgUserDto, orgUser);
        orgUser.setCreateTime(new Date());
        boolean result = orgUserService.save(orgUser);
        if (result == true) {
            return ResponseEntity.ok(orgUser);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @OperationLogDetail(detail = "根据org user更新机构用户信息",
            operationUnit = OperationUnit.ORG_USER, operationType = OperationType.UPDATE)
    @PatchMapping("")
    @ApiOperation("更新机构用户信息（部分字段）")
    public ResponseEntity patch(@RequestBody OrgUser orgUser) {
        // TODO 修改留痕操作：在update前select，对比旧值与新值，将变化的字段和值存入变更记录表
        OrgUser oldOrgUser = orgUserService.getOne(new LambdaQueryWrapper<OrgUser>().eq(OrgUser::getId, orgUser.getId()));

        boolean update = orgUserService.updateById(orgUser);
        if (update) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("")
    @ApiOperation("更新机构用户信息（全部字段）")
    public ResponseEntity update(@RequestBody OrgUserDto orgUserDto) {
        OrgUser orgUser = new OrgUser();
        BeanUtil.copyProperties(orgUserDto, orgUser);
        orgUser.setUpdateTime(new Date());
        boolean result = orgUserService.updateById(orgUser);
        if (result == true) {
            return ResponseEntity.ok(orgUser);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
