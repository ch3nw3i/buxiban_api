package com.buxiban.org.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package: com.buxiban.org.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-28 0:23
 */
@Data
@ApiModel
@TableName("org_teacher")
public class OrgTeacher implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiParam(value = "所属机构id")
    private Integer orgId;

    @ApiParam(value = "姓名")
    private String name;

    @ApiParam(value = "头像URL")
    private String avatarUrl;

    @ApiParam(value = "生日（年月日）")
    private Date birthdayDate;

    @ApiParam(value = "毕业院校")
    private String college;

    @ApiParam(value = "所学专业")
    private String major;

    @ApiParam(value = "学历")
    private String eduBackground;

    @ApiParam(value = "大学毕业日期（年月）")
    private Date graduateDate;

    @ApiParam(value = "从事教育行业的时长（年）")
    private Integer seniority;

    @ApiParam(value = "教师介绍")
    private String description;

    @ApiParam(value = "是否标记禁用")
    private Boolean isForbid = false;

    @ApiParam(value = "是否标记删除")
    private Boolean isDelete = false;

    @ApiParam(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiParam(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
