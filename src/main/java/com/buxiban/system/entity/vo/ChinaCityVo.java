package com.buxiban.system.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.system.entity.vo
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 21:47
 */
@Data
@ApiModel
public class ChinaCityVo implements Serializable {
    private Long cityId;
    private String cityName;
}
