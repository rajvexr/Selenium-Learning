package com.qt.testng;

import org.testng.annotations.*;

public class Example {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");}

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");}

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");}

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");}

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");}

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");}

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");}

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");}


    @Test(groups = "Sanity")
    public void b() {
        System.out.println("test b");
    }


    @Parameters({"fname", "lname"})
    @Test(groups = "Regression")
    public void c(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }

    @Test(groups = "Regression", dataProvider = "dp")
    public void e(String username, String password) {
        System.out.println(username+" "+password);
    }

    @Test(groups = "x")
    public void f() {
        System.out.println("test f");
    }

    @DataProvider
    public Object[][] dp() {
        Object[][] d = new Object[3][2];
        d[0][0] = "username1";
        d[0][1] = "password1";
        d[1][0] = "username2";
        d[1][1] = "password2";
        d[2][0] = "password3";
        d[2][1] = "username4";
        return d;
    }


}