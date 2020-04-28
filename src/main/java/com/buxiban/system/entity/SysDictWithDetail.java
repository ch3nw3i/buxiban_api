package com.buxiban.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 7:50
 */
@Data
@ApiModel
public class SysDictWithDetail implements Serializable {
    @ApiParam("字典组id")
    private Integer id;

    @ApiParam("字典组键/关键字")
    private String groupKey;

    @ApiParam("字典组值/描述")
    private String groupValue;

    private Boolean isDelete = false;
    private Date createTime;
    private Date updateTime;

    private List<SysDictDetail> dictDetailList;
}
