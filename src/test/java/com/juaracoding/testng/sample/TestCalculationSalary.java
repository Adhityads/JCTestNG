package com.juaracoding.testng.sample;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculationSalary {

    Employee employee;
    CalculationSalary calculationSalary;

    @BeforeMethod
    public void setUp(){
        employee = new Employee();
        calculationSalary = new CalculationSalary();
    }

    @Test(priority = 2)
    public void testCalculateTaxOne(){
        employee.setName("Adhityads");
        employee.setSalary(10000);
        employee.setTax(10);

        double actual = calculationSalary.calculateTax(employee);
        Assert.assertEquals(actual, 9000);
    }

    @Test(priority = 1)
    public void testCalculateTaxTwo(){
        employee.setName("Adhityads");
        employee.setSalary(6000);
        employee.setTax(10);

        double actual = calculationSalary.calculateTax(employee);
        Assert.assertEquals(actual, 6000);
    }

    @Test(priority = 3)
    public void testGetEmployeeName(){
        employee.setName("Adhityads");
        employee.setSalary(6000);
        employee.setTax(10);

        String actual = employee.getName();
        Assert.assertEquals(actual, "Adhityads");
    }

    @Test(priority = 4)
    public void testGetEmployeeSalary(){
        employee.setName("Adhityads");
        employee.setSalary(10000);
        employee.setTax(10);

        double actual = employee.getSalary();
        Assert.assertEquals(actual, 10000);
    }

    @Test(priority = 5)
    public void testGetEmployeeTax(){
        employee.setName("Adhityads");
        employee.setSalary(10000);
        employee.setTax(10);

        double actual = employee.getTax();
        Assert.assertEquals(actual, 10);
    }

}