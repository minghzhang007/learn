package com.lewis.learn.visiblefortesting;

import com.google.common.base.Preconditions;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanhuai.zmh@alibaba-inc.com
 * @date 2018/04/04
 */
public class VisibleForTestingDemoTest {

    @Test
    public void test() {
        VisibleForTestingDemo demo = new VisibleForTestingDemo();
        try {
            Method method = VisibleForTestingDemo.class.getDeclaredMethod("sayHello", String.class);
            method.setAccessible(true);
            Object lewis = method.invoke(demo, "lewis");
            Assert.assertEquals("Hello ! lewis", lewis);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        VisibleForTestingDemo demo = new VisibleForTestingDemo();
        try {
            Object sayHello = testPrivateMethod(demo, "sayHello", new Class[]{String.class}, new Object[]{"lewisZhang"});
            Assert.assertEquals(sayHello, "Hello ! lewisZhang");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Object testPrivateMethod(Object obj, String methodName, Class<?>[] parameterTypes, Object[] parameters) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Preconditions.checkArgument(obj != null);
        Preconditions.checkArgument(methodName != null && methodName.trim().length() > 0);
        Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
        method.setAccessible(true);
        Object invoke = method.invoke(obj, parameters);
        return invoke;
    }
}
