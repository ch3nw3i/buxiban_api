package com.buxiban.org.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.EnumSet;

/**
 * @Package: com.buxiban.org.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-04-27 23:32
 */
@Data
@ApiModel
@TableName("org_course")
public class OrgCourse implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer orgId;

    private Integer orgTeacherId;

    @ApiParam("教学场所id")
    private Integer locationId;

    @ApiParam("课程类别id")
    private Integer dictCourseId;

    @ApiParam("课程名称")
    private String name;

    @ApiParam("课程介绍")
    private String description;

    @ApiParam("最小开课人数")
    private Integer minStudentNum;

    @ApiParam("最大接受人数")
    private Integer maxStudentNum;

    @ApiParam("开课日期（年月日）")
    private Date startDate;

    @ApiParam("结课日期（年月日）")
    private Date predictEndDate;

    @ApiParam("每周上课星期数（1~7）")
    private Integer perWeek;

    @ApiParam("每次课程开始时间（时分秒）")
    private Date detailStartTime;

    @ApiParam("每次课程结束时间（时分秒）")
    private Date detailEndTime;

    @ApiParam("每节课时长")
    private Float courseLength;

    @ApiParam("全套课程总时长")
    private Float totalCourseLength;

    @ApiParam("时间单位id")
    private Integer timeUnitId;

    @ApiParam("全套课程总次数")
    private Integer totalCourseNumber;

    @ApiParam("课程原价（RMB）")
    private BigDecimal originalPrice;

    @ApiParam("课程优惠价（RMB）")
    private BigDecimal promotionPrice;

    @ApiParam("是否发布")
    private Boolean isPublish = false;

    @ApiParam("是否删除")
    private Boolean isDelete = false;

    private Date createTime;
    private Date updateTime;

}
