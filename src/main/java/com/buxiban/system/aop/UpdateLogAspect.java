package com.buxiban.system.aop;

import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.buxiban.org.entity.OrgUser;
import com.buxiban.org.entity.dto.OrgUserDto;
import com.buxiban.org.service.OrgUserService;
import com.buxiban.system.annotation.UpdateLogDetail;
import com.buxiban.system.entity.UpdateLog;
import com.buxiban.system.service.UpdateLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

import static com.baomidou.mybatisplus.core.toolkit.IdWorker.getId;


/**
 * @Package: com.buxiban.system.aop
 * @Author: ch3nw3i@github
 * @Date: 2020-05-19 22:47
 */
//@Aspect
//@Component
public class UpdateLogAspect {

    @Autowired
    private UpdateLogService updateLogService;

    @Autowired
    private OrgUserService orgUserService;

    /**
     * 此处的切点是注解的方式，也可以用包名的方式达到相同的效果
     * '@Pointcut("execution(* com.wwj.springboot.service.impl.*.*(..))")'
     */
    @Pointcut("@annotation(com.buxiban.system.annotation.UpdateLogDetail)")
    public void updateLog() {
    }

    @Before("updateLog()")
    public Object doBefore(JoinPoint joinPoint) throws Throwable {
        Object arg = joinPoint.getArgs()[0];
        Class<?> aClass = arg.getClass();
        String name = aClass.getName();
        boolean result = StrUtil.contains(name, "OrgUserDto");
        Object oldObj = null;
        if (result) {
//            Field id = ReflectUtil.getField(aClass, "id");
//            Integer id = ((OrgUserDto) arg).getId();
//            OrgUser orgUser = orgUserService.getOne(new LambdaQueryWrapper<OrgUser>().eq(OrgUser::getId, id));
//            String s = id.toString();
//            System.out.println(orgUser.toString());
//            oldObj = (Object) orgUser;

        }
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        signature.getMethod().invoke();
        return oldObj;
    }

    /**
     * 环绕增强，相当于MethodInterceptor
     */
    @Around("updateLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object response = null;
        try {
            UpdateLog updateLog = new UpdateLog();
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            UpdateLogDetail annotation = signature.getMethod().getAnnotation(UpdateLogDetail.class);
            if (annotation != null) {
                updateLog.setTableName(annotation.updatetTable().getValue());
            }
            response = joinPoint.proceed();
            return response;
        } finally {
            try {
                //方法执行完成后增加日志
                this.addUpdateLog(joinPoint, response);
            } catch (Exception e) {
                System.out.println("### UpdateLog 操作失败：" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void addUpdateLog(JoinPoint joinPoint, Object response) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        UpdateLog updateLog = new UpdateLog();
//        UpdateLogDetail annotation = signature.getMethod().getAnnotation(UpdateLogDetail.class);
//        if (annotation != null) {
//            updateLog.setTableName(annotation.updatetTable().getValue());
//            if (StrUtil.contains(updateLog.getTableName(), "org_user")) {
//
//            }
//        }
////        OperationLog operationLog = new OperationLog();
////        operationLog.setRunTime(time);
//        operationLog.setReturnValue(JSON.toJSONString(response));
//        operationLog.setId(UUID.randomUUID().toString());
//        operationLog.setArgs(JSON.toJSONString(joinPoint.getArgs()));
////        operationLog.setCreateTime(new Date());
//        operationLog.setMethod(signature.getDeclaringTypeName() + "." + signature.getName());
//        operationLog.setUserId("#{currentUserId}");
//        operationLog.setUserName("#{currentUserName}");
//        //TODO 这里保存日志到 DB
//        boolean save = updateLogService.save(updateLog);
    }

}
