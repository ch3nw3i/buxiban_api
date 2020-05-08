package com.buxiban.system.api;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buxiban.system.entity.SysPermission;
import com.buxiban.system.entity.SysRole;
import com.buxiban.system.service.SysPermissionService;
import com.buxiban.system.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/system/roles")
@Api(value = "SysRoleController", tags = "角色管理")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysPermissionService sysPermissionService;


    @GetMapping("")
    @ApiOperation("获取所有角色信息")
    public ResponseEntity<List<SysRole>> listAll() {
        return ResponseEntity.ok(sysRoleService.list());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id获取角色")
    public ResponseEntity<SysRole> selectById(@PathVariable("id") Integer id) {
//        SysRole sysRole = sysRoleService.getById(id);
        SysRole sysRole = sysRoleService.selectRoleById(id);
        if (sysRole == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sysRole);
    }
}
