package com.buxiban.common.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.SoundbankResource;
import java.util.Arrays;

/**
 * @Package: com.buxiban.common.utils
 * @Author: ch3nw3i@github
 * @Date: 2020-05-14 21:34
 */
@Aspect
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.buxiban.org.controller..*.*(..))")
    public void orgApiLog() {}

    @Before("orgApiLog()")
    public void logBeforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

        System.out.println("### URL: " + request.getRequestURL().toString());
        System.out.println("### HTTP Method: " + request.getMethod());
        System.out.println("### IP: " + request.getRemoteAddr());
        System.out.println("### The args of controller: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("### " + request.getQueryString());
        System.out.println("### Object " + request);

    }
}
