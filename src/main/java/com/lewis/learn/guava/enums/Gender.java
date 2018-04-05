package com.lewis.learn.guava.enums;

/**
 * @author fanhuai.zmh@alibaba-inc.com on 18/4/3
 */
public enum Gender {
    MALE(1, "男性"), FEMALE(2, "女性");

    private int code;

    private String desc;

    Gender(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
