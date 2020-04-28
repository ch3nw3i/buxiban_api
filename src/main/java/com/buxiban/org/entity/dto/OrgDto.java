package com.buxiban.org.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.org.entity.dto
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:56
 */
@Data
@ApiModel
public class OrgDto implements Serializable {
    @ApiParam(value = "自定义机构号，用于机构员工登录")
    private String orgCode;

    @ApiParam(value = "机构名称")
    private String name;

    @ApiParam(value = "负责人")
    private Integer principalUserId;

    @ApiParam(value = "机构描述")
    private String description;
}
