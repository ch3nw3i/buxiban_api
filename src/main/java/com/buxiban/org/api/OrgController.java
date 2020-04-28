package com.buxiban.org.api;

import com.buxiban.common.entity.BooleanPropertySetter;
import com.buxiban.org.entity.Org;
import com.buxiban.org.entity.dto.OrgDto;
import com.buxiban.org.entity.dto.OrgUpdateDto;
import com.buxiban.org.service.OrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
//import org.springframework.beans.BeanUtils;\
import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.buxiban.org.api
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:15
 */
@RestController
@RequestMapping("/api/org")
@Api(value = "OrgController", tags = "机构")
public class OrgController {

    @Autowired
    private OrgService orgService;


    @GetMapping("/getById")
    @ApiOperation("根据id获取培训机构信息")
    public ResponseEntity getById(@RequestParam("org_id") Integer id) {
        Org org = orgService.getById(id);
        if (org != null) {
            return ResponseEntity.ok(org);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/list")
    @ApiOperation("获取全部培训机构")
    public ResponseEntity list() {
        List<Org> list = orgService.list();
        if (list == null || list.size() <= 0) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(list);
        }
    }

    @PostMapping("/add")
    @ApiOperation("创建培训机构")
    public ResponseEntity add(@RequestBody OrgDto orgDto) {
        Org org = new Org();
        BeanUtil.copyProperties(orgDto, org);
        org.setCreateTime(new Date());
        boolean result = orgService.save(org);
        if (result == true) {
            return ResponseEntity.ok(org);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/setBoolean")
    @ApiOperation("设置机构的禁用/删除状态")
    public ResponseEntity setBoolean(@RequestBody BooleanPropertySetter setter) {
        boolean result = orgService.setBoolean(setter);
        if (result == true) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update")
    @ApiOperation("更新培训机构信息")
    public ResponseEntity update(@RequestBody OrgUpdateDto orgUpdateDto) {
        Org org = new Org();
        BeanUtil.copyProperties(orgUpdateDto, org);
        org.setUpdateTime(new Date());
        boolean result = orgService.updateById(org);
        if (result == true) {
            return ResponseEntity.ok(org);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
