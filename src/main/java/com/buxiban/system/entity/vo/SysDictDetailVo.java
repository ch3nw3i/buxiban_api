package com.buxiban.system.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.system.entity.vo
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 7:36
 */
@Data
@ApiModel
public class SysDictDetailVo implements Serializable {

    @ApiParam("字典组id")
    private Integer id;

    @ApiParam("字典组的键/关键字")
    private String groupKey;

    @ApiParam("字典组的值/描述")
    private String groupValue;

    @ApiParam("字典组子项id")
    private Integer detailId;

    @ApiParam("字典组子项的键")
    private Integer key;

    @ApiParam("字典组子项的值")
    private String value;
}
