package com.buxiban.user.api;


import com.buxiban.user.entity.UserParent;
import com.buxiban.user.service.UserParentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/user/parent")
@Api(value = "UserParentController", tags = "家长管理")
public class UserParentController {

    @Autowired
    private UserParentService userParentService;

    @GetMapping("")
    @ApiOperation("获取所有家长信息")
    public ResponseEntity<List<UserParent>> listAll() {
        List<UserParent> list = userParentService.list();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id获取一个家长信息")
    public ResponseEntity<UserParent> getById(@PathVariable("id") Integer id) {
        UserParent userParent = userParentService.getById(id);
        if (userParent == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userParent);
    }

    @PostMapping("")
    @ApiOperation("新增家长信息")
    public ResponseEntity<UserParent> createUserParent(@RequestBody UserParent userParent) {
        if (userParent.equals(null)) {
            return ResponseEntity.badRequest().build();
        }
        userParent.setCreateTime(new Date());
        boolean result = userParentService.save(userParent);
        if (!result) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(userParent);
        }

    }
}
