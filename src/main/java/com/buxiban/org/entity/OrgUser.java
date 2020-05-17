package com.buxiban.org.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.org.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 21:32
 */
@Data
@ApiModel
@TableName(value = "org_user")
public class OrgUser implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiParam(value = "机构用户id")
    private Integer id;

    @ApiParam(value = "机构id")
    private Integer orgId;

    @ApiParam(value = "机构用户名称")
    private String name;

    @ApiParam(value = "密码")
    private String password;

    @ApiParam(value = "盐值")
    private String salt;

    @ApiParam(value = "机构用户头像")
    private String avatarUrl;

    @ApiParam(value = "手机号码")
    private String tel;

    @ApiParam(value = "Email")
    private String email;

    @ApiParam(value = "是否标记禁用")
    private Boolean isForbid = false;

    @ApiParam(value = "是否标记删除")
    private Boolean isDelete = false;

    @ApiParam(value = "记录创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiParam(value = "记录更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
