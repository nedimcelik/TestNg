package com.cybertek.tests.day7_testng;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGAssertionDemo {

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title", "title","verify title");

        System.out.println("Second Assertion");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2(){
        System.out.println("Second Test Case");
        Assert.assertEquals("url", "url");
    }
    @Test
    public void test3(){
        String expectedTitle = "cybt";
        String actualTitle = "Cybertek";

        // verify that title is starting with Cyb
        Assert.assertTrue(actualTitle.startsWith(expectedTitle));
        Assert.assertTrue(1>1,"i am checking is 2 greater than 1");
    }

    @Test
    public void test4(){
        //verify that email contains @
        String email = "mike@smith.com";

        // System.out.println(email.contains("@"));
        Assert.assertTrue(email.contains("@"),"verify email has @ sign");
    }

    @Test
    public void test5(){
        // verify something is false
        Assert.assertFalse(0>1,"verify that 0 is NOT greater than 1");
    }

    @Test
    public void test6(){

        Assert.assertNotEquals("ONE","TWO");
    }
}
