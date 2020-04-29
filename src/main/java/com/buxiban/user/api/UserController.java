package com.buxiban.user.api;


import cn.hutool.core.bean.BeanUtil;
import com.buxiban.user.entity.User;
import com.buxiban.user.entity.vo.UserVo;
import com.buxiban.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/user")
@Api(value = "UserController", tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listAll")
    @ApiOperation("获取所有用户")
    public ResponseEntity<List<UserVo>> list() {
        List<User> userList = userService.list();
        ArrayList<UserVo> userVoArrayList = new ArrayList<>();
        for (User u : userList) {
            UserVo userVo = new UserVo();
            BeanUtil.copyProperties(u, userVo);
            userVoArrayList.add(userVo);
        }
        return ResponseEntity.ok(userVoArrayList);
    }

    @GetMapping("/get/id")
    @ApiOperation("根据id获取用户信息")
    public ResponseEntity<UserVo> getById(@RequestParam Integer id) {
        User user = userService.getById(id);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        UserVo userVo = new UserVo();
        BeanUtil.copyProperties(user, userVo);
        return ResponseEntity.ok(userVo);
    }
}
