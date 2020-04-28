package com.buxiban.system.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:35
 */
@Data
@ApiModel
public class ChinaCity implements Serializable {
    private Long provinceId;
    private String provinceName;
    private Long cityId;
    private String cityName;
}