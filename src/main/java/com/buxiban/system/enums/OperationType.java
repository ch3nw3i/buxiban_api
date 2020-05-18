package com.buxiban.system.enums;

/**
 * @Package: com.buxiban.system.enums
 * @Author: ch3nw3i@github
 * @Date: 2020-05-18 20:02
 */
public enum OperationType {

    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    SELECT("select"),
    UPDATE("update"),
    INSERT("insert");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OperationType(String s) {
        this.value = s;
    }

}
