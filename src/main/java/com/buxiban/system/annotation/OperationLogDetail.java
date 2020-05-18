package com.buxiban.system.annotation;


import com.buxiban.system.enums.OperationType;
import com.buxiban.system.enums.OperationUnit;

import java.lang.annotation.*;

/**
 * @Package: com.buxiban.system.annotation
 * @Author: ch3nw3i@github
 * @Date: 2020-05-18 20:05
 */
//@OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名", level = 3,
// operationUnit = OperationUnit.USER, operationType = OperationType.SELECT)
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperationLogDetail {


    /**
     * 方法描述,可使用占位符获取参数:{{tel}}
     */
    String detail() default "";

    /**
     * 日志等级:自己定，此处分为1-9
     */
//    int level() default 0;

    /**
     * 操作类型(enum):主要是select,insert,update,delete
     */
    OperationType operationType() default OperationType.UNKNOWN;

    /**
     * 被操作的对象(此处使用enum):可以是任何对象，如表名(user)，或者是工具(redis)
     */
    OperationUnit operationUnit() default OperationUnit.UNKNOWN;

}
