package com.cp.constant;

/**
 * @author ChengPeng
 * @create 2019-11-06 10:16
 */
public enum ExcelFormat {
    FORMAT_INTEGER("INTEGER"),
    FORMAT_DOUBLE("DOUBLE"),
    FORMAT_PERCENT("PERCENT"),
    FORMAT_DATE("DATE");

    private String value;

    ExcelFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
