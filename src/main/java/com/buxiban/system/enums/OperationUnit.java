package com.buxiban.system.enums;

/**
 * @Package: com.buxiban.system.enums
 * @Author: ch3nw3i@github
 * @Date: 2020-05-18 20:03
 */
public enum OperationUnit {

    /**
     * 被操作的单元
     */
    UNKNOWN("unknown"),
    ORG("org"),
    ORG_USER("org_user"),

    SYSTEM_DICT("system_dict"),

    USER("user");


    private String value;

    OperationUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
