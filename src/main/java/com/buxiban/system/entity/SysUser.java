package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 管理员信息表
 * <p>
 * 自定义网站管理者的角色与权限
 * </p>
 *
 * @author ChenWei
 * @since 2020-04-30
 */
@Data
@TableName("sys_user")
@ApiModel
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private Boolean isForbid;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    @TableField(exist = false)
    private Set<SysRole> roles;

}
