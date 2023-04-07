package org.example;

import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{

    public void testcase1_login(){
        App a = new App();
       // Assert.assertEquals(true,a.login_test("user","user123"));
        org.testng.Assert.assertEquals(true,a.login_test("user","user123"));

    }
    public void testcase2_login(){
        App a = new App();
//        Assert.assertEquals(false,a.login_test("user1","user1243"));
        org.testng.Assert.assertEquals(false,a.login_test("user1","user1243"));
    }

}