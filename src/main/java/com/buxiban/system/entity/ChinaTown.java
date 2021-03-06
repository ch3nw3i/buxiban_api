package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class ChinaTown implements Serializable {
    private Long provinceId;
    private String provinceName;
    private Long cityId;
    private String cityName;
    private Long countyId;
    private String countyName;
    @TableId(value = "town_id", type = IdType.AUTO)
    private Long townId;
    private String townName;

}
