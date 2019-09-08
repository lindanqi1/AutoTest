package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.printf("Thread Id: %s\n",Thread.currentThread().getId());
        System.out.println("Test标签1");
    }
}
