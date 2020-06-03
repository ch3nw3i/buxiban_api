package com.buxiban.org.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Package: com.buxiban.org.entity.dto
 * @Author: ch3nw3i@github
 * @Date: 2020-04-26 22:56
 */
@Data
@ApiModel(description = "机构基本信息")
public class OrgDto implements Serializable {
    @ApiModelProperty(value = "自定义机构号，用于机构员工登录", required = true)
    @NotNull(message = "自定义机构号 不能为空")
    private String orgCode;

    @ApiModelProperty(value = "机构名称", required = true)
    @NotNull(message = "机构名称 不能为空")
    private String name;

    @ApiModelProperty(value = "机构负责人", required = true)
    @NotNull(message = "机构负责人 不能为空")
    private Integer principalUserId;

    @ApiModelProperty(value = "机构描述")
    private String description;
}
