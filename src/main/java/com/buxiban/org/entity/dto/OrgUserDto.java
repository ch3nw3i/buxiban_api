package com.buxiban.org.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.org.entity.dto
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:48
 */

@Data
@ApiModel
public class OrgUserDto implements Serializable {
    @ApiParam(value = "机构id")
    private Integer orgId;

    @ApiParam(value = "机构用户名称")
    private String name;

    @ApiParam(value = "密码")
    private String password;

    @ApiParam(value = "机构用户头像")
    private String avatar_url;

    @ApiParam(value = "手机号码")
    private String tel;

    @ApiParam(value = "Email")
    private String email;
}
