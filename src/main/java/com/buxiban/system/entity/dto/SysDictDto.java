package com.buxiban.system.entity.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.buxiban.system.entity.SysDictDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.buxiban.system.entity.dto
 * @Author: ch3nw3i@github
 * @Date: 2020-05-03 17:12
 */
@Data
@ApiModel
public class SysDictDto {

    @ApiParam("字典组id")
    private Integer id;

    @ApiParam("字典组键/关键字")
    private String groupKey;

    @ApiParam("字典组值/描述")
    private String groupValue;

    private Boolean isDelete = false;
    private Date createTime;
    private Date updateTime;

    private List<SysDictDetail> dictDetails;
}
