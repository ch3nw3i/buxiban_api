package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 0:51
 */
@Data
@ApiModel
@TableName("sys_dict")
public class SysDict implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiParam("字典组id")
    private Integer id;

    @ApiParam("字典组键/关键字")
    private String groupKey;

    @ApiParam("字典组值/描述")
    private String groupValue;

    private Boolean isDelete = false;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

}
