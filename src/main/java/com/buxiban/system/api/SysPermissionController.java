package com.buxiban.system.api;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.buxiban.system.entity.SysPermission;
import com.buxiban.system.service.SysPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/system/permissions")
@Api(value = "SysPermissionController", tags = "权限管理")
public class SysPermissionController {

    @Autowired
    private SysPermissionService sysPermissionService;

    @GetMapping("")
    @ApiOperation("获取所有权限信息")
    public ResponseEntity<List<SysPermission>> listAll() {
        return ResponseEntity.ok(sysPermissionService.list());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id获取权限信息")
    public ResponseEntity<SysPermission> getById(@PathVariable("id") Integer id) {
        SysPermission sysPermission = sysPermissionService.getById(id);
        if (sysPermission == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sysPermission);
    }

    @PostMapping("")
    @ApiOperation("新增一个权限信息")
    public ResponseEntity<SysPermission> add(@RequestBody SysPermission sysPermission) {
        boolean result = sysPermissionService.save(sysPermission);
        if (result) {
            return ResponseEntity.ok(sysPermission);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PatchMapping("")
    @ApiOperation("更新权限信息（部分字段）")
    public ResponseEntity<SysPermission> patch(@RequestBody SysPermission sysPermission) {
        boolean result = sysPermissionService.updateById(sysPermission);
        if (result) {
            return ResponseEntity.ok(sysPermission);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除权限信息")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        boolean result = sysPermissionService.removeById(id);
        if (result) {
            return ResponseEntity.ok("Delete Success");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
