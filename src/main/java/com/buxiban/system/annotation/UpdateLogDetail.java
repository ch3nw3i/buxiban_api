package com.buxiban.system.annotation;

import com.buxiban.system.enums.UpdateTable;

import java.lang.annotation.*;

/**
 * @Package: com.buxiban.system.annotation
 * @Author: ch3nw3i@github
 * @Date: 2020-05-19 22:49
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateLogDetail {


    /**
     * 方法描述,可使用占位符获取参数:{{tel}}
     */
    String detail() default "";

    /**
     * 被操作的对象(此处使用enum):可以是任何对象，如表名(user)，或者是工具(redis)
     */
    UpdateTable updatetTable() default UpdateTable.UNKNOWN;
}
