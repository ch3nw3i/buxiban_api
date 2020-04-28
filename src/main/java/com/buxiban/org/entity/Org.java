package com.buxiban.org.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.org.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:23
 */
@Data
@ApiModel
@TableName(value = "org")
public class Org implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    @ApiParam(value = "机构id")
    private Integer id;

    @ApiParam(value = "自定义机构号，用于机构员工登录")
    private String orgCode;

    @ApiParam(value = "机构名称")
    private String name;

    @ApiParam(value = "负责人")
    private Integer principalUserId;

    @ApiParam(value = "机构描述")
    private String description;

    @ApiParam(value = "是否禁用")
    private Boolean isForbid = false;

    @ApiParam(value = "是否注销机构")
    private Boolean isDelete = false;

    @ApiParam(value = "记录创建时间")
    private Date createTime;

    @ApiParam(value = "记录更新时间")
    private Date updateTime;


}
