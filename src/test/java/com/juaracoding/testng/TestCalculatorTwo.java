package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculatorTwo {

    Calculator calculator;
    int a , b ;

    @BeforeMethod
    public void setUp(){
        calculator = new Calculator();
        a = 10;
        b = 10;
    }

    @Test
    public void testAdd() {
//        Calculator calculator = new Calculator();
        int actual = calculator.add(a, b);//pada testNG actual dulu baru expect
        int expect = 20; //actual = hasil dari programmer, expect = hasil dari QA
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void testSubstract() {
//        Calculator calculator = new Calculator();
//        int actual = calculator.substract(a, b);
//        int expect = 5;
        Assert.assertEquals(calculator.substract(a, b), 0);
    }

}
