package com.juaracoding.testng;

import jdk.jfr.Description;
import org.testng.annotations.*;

public class ProcedureExecution {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before CLass");
    }

    @BeforeMethod
    public void beforeMethode(){
        System.out.println("Before Method");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @Test(priority = 1)
    public void testOne(){
        System.out.println("Test One");
    }

    @Test(priority = 2)
    public void testTwo(){
        System.out.println("Test Two");
    }

    @Test(priority = 3)
    public void testThree(){
        System.out.println("Test Three");
    }


}
