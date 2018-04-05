package com.lewis.learn.autovalue;

import com.google.common.collect.Lists;
import com.lewis.learn.lombok.Student;

public class StudentTest {

    public void test1(){
        //Student.StudentBuilder()
        Student build = Student.builder().id("123").idCardNo("24234").name("lewis").hobbies(Lists.newArrayList("fdas")).build();
    }
}
