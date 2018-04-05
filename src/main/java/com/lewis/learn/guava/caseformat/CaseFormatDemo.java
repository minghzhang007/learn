package com.lewis.learn.guava.caseformat;

import com.google.common.base.CaseFormat;

public class CaseFormatDemo {

    /**
     * lowerCamel
     */
    public static final CaseFormat LOWER_CAMEL = CaseFormat.LOWER_CAMEL;

    /**
     * lower-hyphen
     */
    public static final CaseFormat LOWER_HYPHEN = CaseFormat.LOWER_HYPHEN;
    /**
     * lower_underscore
     */
    public static final CaseFormat LOWER_UNDERSCORE = CaseFormat.LOWER_UNDERSCORE;
    /**
     * UpperCamel
     */
    public static final CaseFormat UPPER_CAMEL = CaseFormat.UPPER_CAMEL;
    /**
     * UPPER_UNDERSCORE
     */
    public static final CaseFormat UPPER_UNDERSCORE = CaseFormat.UPPER_UNDERSCORE;

    public static void main(String[] args) {
        String name ="lewis_zhang";
        System.out.println(LOWER_CAMEL.to(LOWER_HYPHEN,"lewisZhang"));
        System.out.println();
    }
}
