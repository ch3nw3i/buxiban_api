package com.buxiban.system.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.buxiban.system.entity
 * @Author: ch3nw3i@github
 * @Date: 2020-05-19 22:06
 */
@Data
@TableName("update_log")
public class UpdateLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "table_name")
    private String tableName;

    @TableField(value = "fk_id")
    private Integer fkId;

    @TableField(value = "kv")
    private String kv;

    @TableField(value = "create_by")
    private String createBy;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;
}
