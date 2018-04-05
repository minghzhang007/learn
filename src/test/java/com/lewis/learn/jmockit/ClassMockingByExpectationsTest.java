package com.lewis.learn.jmockit;

import junit.framework.Assert;
import mockit.Expectations;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author fanhuai.zmh@alibaba-inc.com
 * @date 2018/04/05
 */
public class ClassMockingByExpectationsTest {

    //@BeforeClass
    public static void loadNative() throws URISyntaxException {
        URI uri = ClassLoader.class.getResource("/").toURI();
        String realPath = new File(uri).getAbsolutePath() + "/libAnOrdinaryClass.dll";
        System.load(realPath);
    }

    @Test
    public void testClassMockingByExpectation(){
        AnOrdinaryClass instanceToRecord = new AnOrdinaryClass();
        new Expectations(AnOrdinaryClass.class){
            {
                AnOrdinaryClass.staticMethod("lewis");
                result="staticMethod :lewis";

                instanceToRecord.instanceMethod("lewis");
                result = "instanceMethod :lewis";

                instanceToRecord.finalMethod("lewis");
                result ="finalMethod :lewis";
            }
        };

        AnOrdinaryClass instance = new AnOrdinaryClass();
        Assert.assertTrue(AnOrdinaryClass.staticMethod("lewis").equals("staticMethod :lewis"));
        Assert.assertTrue(instance.instanceMethod("lewis").equals("instanceMethod :lewis"));
        Assert.assertTrue(instance.finalMethod("lewis").equals("finalMethod :lewis"));
        Assert.assertTrue(instance.callPrivateMethod("lewis").equals("privateMethod :lewis"));


    }
}
