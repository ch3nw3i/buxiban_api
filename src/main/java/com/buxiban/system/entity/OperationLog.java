package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Package: com.buxiban.common.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-05-18 20:04
 */
@Data
@TableName("operation_log")
public class OperationLog {

    @TableId("id")
    private String id;

    @TableField("create_time")
    private Date createTime;

    /**
     * 被操作的对象
     */
    @TableField("operation_unit")
    private String operationUnit;
    /**
     * 方法名
     */
    @TableField("method")
    private String method;
    /**
     * 参数
     */
    @TableField("args")
    private String args;
    /**
     * 操作人id
     */
    @TableField("user_id")
    private String userId;
    /**
     * 操作人
     */
    @TableField("user_name")
    private String userName;
    /**
     * 操作类型
     */
    @TableField("operation_type")
    private String operationType;
    /**
     * 方法运行时间
     */
    @TableField("run_time")
    private Long runTime;
    /**
     * 方法返回值
     */
    @TableField("return_value")
    private String returnValue;

}
