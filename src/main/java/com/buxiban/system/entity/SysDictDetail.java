package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 0:55
 */
@Data
@ApiModel
@TableName("sys_dict")
public class SysDictDetail implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    @ApiParam("字典组子项id")
    private Integer id;

    @ApiParam("字典组id")
    private Integer dictGroupId;

    @ApiParam("字典组子项的键")
    private Integer key;

    @ApiParam("字典组子项的值")
    private String value;

    private Boolean isDelete = false;
    private Date createTime;
    private Date updateTime;

}
