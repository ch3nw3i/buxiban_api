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
 * @Date: 2020-04-28 0:46
 */
@Data
@ApiModel
@TableName("sys_location")
public class SysLocation implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiParam("省份、自治区、直辖市")
    private Integer provinceId;
    private String provinceName;

    @ApiParam("市")
    private Integer cityId;
    private String cityName;

    @ApiParam("区、县")
    private Integer countyId;
    private String countyName;

    @ApiParam("乡镇、街道")
    private Integer townId;
    private String townName;

    @ApiParam("某路某号某室")
    private String detailAddress;

    @ApiParam("经度")
    private Double longitude;
    @ApiParam("纬度")
    private Double latitude;

    private Boolean isDelete = false;
    private Date createTime;
    private Date updateTime;

}
