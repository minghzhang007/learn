package com.lewis.learn.guava.enums;

import com.google.common.base.Enums;
import com.google.common.base.Optional;

/**
 * @author fanhuai.zmh@alibaba-inc.com on 18/4/3
 */
public class EnumsDemo {

    public static void main(String[] args) {
        String name = "MALE";
        Optional<Gender> male = Enums.getIfPresent(Gender.class, name);
        System.out.println(male.get());
        Optional<Gender> female = Enums.getIfPresent(Gender.class, "FEMALE");
        System.out.println(female.get());
    }
}