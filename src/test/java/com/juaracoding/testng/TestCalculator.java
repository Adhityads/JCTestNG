package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 5);
        int expect = 15;
        Assert.assertEquals(actual, expect);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int actual = calculator.substract(10, 5);
        int expect = 5;
        Assert.assertEquals(actual, expect);
    }


}
