package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 20:33
 */
@Data
@ApiModel
@TableName("china_province")
public class ChinaProvince implements Serializable {
    @TableId(value = "province_id", type = IdType.AUTO)
    private Long provinceId;
    private String provinceName;
}
