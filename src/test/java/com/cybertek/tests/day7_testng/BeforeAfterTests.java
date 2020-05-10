package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){
        // webdriver part
        System.out.println("this is my test 1");
        // close browser, quit
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("this is my test 2");
    }

    @BeforeMethod
    public void setUp(){
        // web driver part
        System.out.println("before method here");
        System.out.println("web driver part");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("after method here");
        System.out.println("driver quit");
    }

    @Test
    public void test3(){
        System.out.println("this is my test 3");
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("------before class------");
        System.out.println("------run only once in the class------");
    }

    @AfterClass
    public void closeClass(){
        System.out.println("------after class------");
        System.out.println("------run only once in the class------");
    }

}
