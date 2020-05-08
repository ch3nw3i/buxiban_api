package com.buxiban.system.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Package: com.buxiban.system.entity.vo
 * @Author: ch3nw3i@github
 * @Date: 2020-05-03 9:16
 */
@Data
@ApiModel
public class SysRoleVo {
    private Integer id;

    private String role;

    private String description;
}
