package com.buxiban.org.api;

import cn.hutool.core.bean.BeanUtil;
import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.OrgUser;
import com.buxiban.org.entity.dto.OrgUserDto;
import com.buxiban.org.service.OrgUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.buxiban.org.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:38
 */
@RestController
@Api(value = "OrgUserController", tags = "机构用户")
@RequestMapping("/orgUser")
public class OrgUserController {

    @Autowired
    private OrgUserService orgUserService;

    @GetMapping("/get")
    @ApiOperation("根据id获取机构用户")
    public ResponseEntity<OrgUser> get(@RequestParam Integer id) {
        OrgUser orgUser = orgUserService.getById(id);
        return ResponseEntity.ok(orgUser);
    }

    @GetMapping("/list")
    @ApiOperation("获取全部机构用户")
    public ResponseEntity<List<OrgUser>> list() {
        List<OrgUser> list = orgUserService.list();
        if (list == null || list.size() <= 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add")
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

    @PostMapping("/setBoolean")
    @ApiOperation("设置机构用户的禁用/删除状态")
    public ResponseEntity setBoolean(@RequestBody BooleanPropertySetter setter) {
        boolean result = orgUserService.setBoolean(setter);
        if (result == true) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update")
    @ApiOperation("更新机构用户信息")
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
