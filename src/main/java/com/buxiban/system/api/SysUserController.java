package com.buxiban.system.api;


import com.buxiban.system.entity.SysUser;
import com.buxiban.system.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

/**
 * <p>
 * 管理员信息表

自定义网站管理者的角色与权限 前端控制器
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/system/user")
@Api(value = "SysUserController", tags = "用户管理")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("")
    public ResponseEntity<List<SysUser>> listAll() {
        return ResponseEntity.ok(sysUserService.list());
    }

    @GetMapping("/{username}")
    @ApiOperation("根据username获取用户")
    public ResponseEntity<SysUser> getByUsername(@PathVariable("username") String username) {
        SysUser sysUser = sysUserService.getSysUserByUsername(username);
        return ResponseEntity.ok(sysUser);
    }

    @PostMapping("/login")
    @ApiOperation("管理员用户登录")
    public ResponseEntity login(String username, String password) {
        SysUser sysUser = sysUserService.getSysUserByUsername(username);
        if (password.equals(sysUser.getPassword())) {
            return ResponseEntity.ok(sysUser);
        }
        return ResponseEntity.notFound().build();
    }

}
