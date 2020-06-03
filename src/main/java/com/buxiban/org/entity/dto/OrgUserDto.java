package com.buxiban.org.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Package: com.buxiban.org.entity.dto
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:48
 */

@Data
@ApiModel(description = "机构用户")
public class OrgUserDto implements Serializable {
    @ApiModelProperty(value = "机构用户id", notes = "新增时可不填，更新时必填")
    private Integer id;

    @ApiModelProperty(value = "机构id", required = true)
    @NotNull(message = "机构id不能为空")
    private Integer orgId;

    @ApiModelProperty(value = "机构用户名称", required = true)
    @NotNull(message = "机构用户名称不能为空")
    private String name;

    @ApiModelProperty(value = "密码", required = true)
    @NotNull(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "机构用户头像")
    private String avatar_url;

    @ApiModelProperty(value = "手机号码")
    private String tel;

    @ApiModelProperty(value = "Email")
    private String email;
}
