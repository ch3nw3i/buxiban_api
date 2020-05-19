package com.buxiban.system.enums;

/**
 * @Package: com.buxiban.system.enums
 * @Author: ch3nw3i@github
 * @Date: 2020-05-19 22:50
 */
public enum UpdateTable {
    /**
     * 被操作的 数据库表
     */
    UNKNOWN("unknown"),
    ORG_USER("org_user");

    private String value;

    UpdateTable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
