package com.buxiban.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.common.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 22:00
 */
@Data
@ApiModel
public class BooleanPropertySetter implements Serializable {
    @ApiParam("主键id")
    private Integer id;

    @ApiParam("布尔属性名")
    private String name;

    @ApiParam("布尔属性值")
    private Boolean value;
}
