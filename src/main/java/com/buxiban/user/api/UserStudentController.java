package com.buxiban.user.api;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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

}
