package com.buxiban.user.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.user.entity.vo
 * @Author: ch3nw3i@github
 * @Date: 2020-04-29 22:36
 */
@Data
@ApiModel
public class UserVo implements Serializable {

    private Integer id;

    private String username;

    private String tel;

    private String email;

    private String avatarUrl;

    private Date createTime;

    private Date updateTime;
}
