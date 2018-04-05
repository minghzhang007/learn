package com.lewis.learn.jmockit;

/**
 * @author fanhuai.zmh@alibaba-inc.com
 * @date 2018/04/05
 */
public class AnOrdinaryClass {

    public static String staticMethod(String name){
        return "staticMethod :"+name;
    }

    public String instanceMethod(String name){
        return "instanceMethod :"+ name;
    }

    public final String finalMethod(String name){
        return "finalMethod :"+name;
    }

    public native int nativeMethod();

    private String privateMethod(String name){
        return "privateMethod :"+name;
    }

    public String callPrivateMethod(String name){
        return privateMethod(name);
    }
}
