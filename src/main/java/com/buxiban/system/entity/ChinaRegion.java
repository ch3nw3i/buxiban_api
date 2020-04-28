package com.buxiban.system.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:39
 */
@Data
@ApiModel
public class ChinaRegion implements Serializable {
    private Long provinceId;
    private String provinceName;
    private Long cityId;
    private String cityName;
    private Long countyId;
    private String countyName;
    private Long townId;
    private String townName;

}
