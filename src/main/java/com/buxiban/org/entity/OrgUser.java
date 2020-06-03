package com.buxiban.org.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.org.entity
 * @Author: ch3nw3i@github
 *  @Date: 2020-04-27 21:32
 */
@Data
@ApiModel(description = "机构用户")
@TableName(value = "org_user")
public class OrgUser implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "机构用户id")
    private Integer id;

    @ApiModelProperty(value = "机构id")
    private Integer orgId;

    @ApiModelProperty(value = "机构用户名称")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "盐值")
    private String salt;

    @ApiModelProperty(value = "机构用户头像")
    private String avatarUrl;

    @ApiModelProperty(value = "手机号码")
    private String tel;

    @ApiModelProperty(value = "Email")
    private String email;

    @ApiModelProperty(value = "是否标记禁用")
    private Boolean isForbid = false;

    @ApiModelProperty(value = "是否标记删除")
    private Boolean isDelete = false;

    @ApiModelProperty(value = "记录创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "记录更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
