package com.lewis.learn.autovalue;

import org.junit.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    public void test1(){
        Person lewis = Person.builder().setId("1").setIdCardNo("12321").setName("lewis").setAge(123)
                .setHobbies(new ArrayList<>()).build();

    }
}
