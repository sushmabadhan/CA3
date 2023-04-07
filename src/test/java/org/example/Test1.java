package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test1 {
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will run before every method");

    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will run after every method");
    }

    void test1(){
        System.out.println("This is test1");
    }
    void test2(){
        System.out.println("This is test2");
}
    void test3() {

        System.out.println("This is test3");
    }
}