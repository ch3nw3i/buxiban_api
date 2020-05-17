package com.buxiban.user.controller;


import com.buxiban.user.entity.UserStudent;
import com.buxiban.user.service.UserStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-29
 */
@RestController
@RequestMapping("/user/student")
@Api(value = "UserStudentController", tags = "学生管理")
public class UserStudentController {

    @Autowired
    private UserStudentService userStudentService;

    @GetMapping("")
    @ApiOperation("获取所有学生信息")
    public ResponseEntity<List<UserStudent>> listAll() {
        List<UserStudent> list = userStudentService.list();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    @ApiOperation("获取指定id的学生用户信息")
    public ResponseEntity<UserStudent> getById(@PathVariable("id") Integer id) {
        UserStudent userStudent = userStudentService.getById(id);
        return ResponseEntity.ok(userStudent);
    }

    @PostMapping("")
    @ApiOperation("新增一条学生信息")
    public ResponseEntity<UserStudent> createUserStudent(@RequestBody UserStudent userStudent) {
        if (userStudent == null) {
            return ResponseEntity.badRequest().build();
        }
        boolean result = userStudentService.save(userStudent);
        if (result) {
            return ResponseEntity.ok(userStudent);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PatchMapping("")
    @ApiOperation("更新指定id的学生用户信息（部分字段）")
    public ResponseEntity<UserStudent> patch(@RequestBody UserStudent userStudent) {
        if (userStudent == null) {
            return ResponseEntity.badRequest().build();
        }
        boolean result = userStudentService.updateById(userStudent);
        if (result) {
            return ResponseEntity.ok(userStudent);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
