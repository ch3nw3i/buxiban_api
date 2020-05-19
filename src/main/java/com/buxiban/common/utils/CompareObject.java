package com.buxiban.common.utils;

import com.buxiban.org.entity.OrgUser;
import com.google.common.collect.Lists;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package: com.buxiban.common.utils
 * @Author: ch3nw3i@github
 * @Date: 2020-05-18 23:43
 */
public class CompareObject {

    public static void main(String[] args) {
        OrgUser oldOrgUser = new OrgUser();
        oldOrgUser.setId(13);
        oldOrgUser.setIsDelete(true);

        OrgUser newOrgUser = new OrgUser();
        newOrgUser.setId(13);
        newOrgUser.setIsDelete(false);

        contrastObj(oldOrgUser, newOrgUser, OrgUser.class);
    }

    public static Map<String, String> contrastObj(Object oldObj, Object newObj, Class cls) {
        if (oldObj.getClass() == newObj.getClass()) {
            OrgUser oldOrgUser = (OrgUser) oldObj;
            OrgUser newOrgUser = (OrgUser) newObj;
            List<String> textList = Lists.newArrayList();
            Map<String, String> map = new LinkedHashMap<>();
            try {
                Class<?> aClass = oldOrgUser.getClass();
                Field[] fields = oldOrgUser.getClass().getDeclaredFields();
                for (Field field : fields) {
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), aClass);
                    Method readMethod = propertyDescriptor.getReadMethod();
                    Object o1 = readMethod.invoke(oldOrgUser);
                    Object o2 = readMethod.invoke(newOrgUser);
                    String s1 = (o1 == null) ? "" : o1.toString();
                    String s2 = (o2 == null) ? "" : o2.toString();
                    if (!s1.equals(s2)) {
                        map.put(field.getName(), s2);
                        textList.add("[UPDATE] Field: " + field.getName() + " | VALUE：" + s1 + " => " + s2 + "");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
//            long after = System.currentTimeMillis();
//            Long time = after - before;
//            System.out.println(time);
            for (Object object : textList) {
                System.out.println(object);
            }
            return map;
        } else {
            return null;
        }
    }
//    public static void contrastObj(Object oldObj, Object newObj) {
//        long before = System.currentTimeMillis();
//        if (oldObj instanceof OrgUser && newObj instanceof OrgUser) {
//            OrgUser oldOrgUser = (OrgUser) oldObj;
//            OrgUser newOrgUser = (OrgUser) newObj;
//            List<String> textList = Lists.newArrayList();
//            try {
//                Class<?> aClass = oldOrgUser.getClass();
//                Field[] fields = oldOrgUser.getClass().getDeclaredFields();
//                for (Field field : fields) {
//                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), aClass);
//                    Method readMethod = propertyDescriptor.getReadMethod();
//                    Object o1 = readMethod.invoke(oldOrgUser);
//                    Object o2 = readMethod.invoke(newOrgUser);
//                    String s1 = (o1 == null) ? "" : o1.toString();
//                    String s2 = (o2 == null) ? "" : o2.toString();
//                    if (! s1.equals(s2)) {
//                        textList.add("[UPDATE] Field: " + field.getName() + " | VALUE：" + s1 + " => " + s2 + "");
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            long after = System.currentTimeMillis();
//            Long time = after - before;
//            System.out.println(time);
//            for (Object object : textList) {
//                System.out.println(object);
//            }
//        }
//    }
}
