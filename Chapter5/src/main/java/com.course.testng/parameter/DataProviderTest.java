package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name= "+name+"; age= "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222方法 name= "+name+"; age= "+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"wangwu",30},
                    {"zhaoliu",40}
            };
        }
        return result;
    }
}
