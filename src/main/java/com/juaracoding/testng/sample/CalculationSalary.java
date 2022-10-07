package com.juaracoding.testng.sample;

public class CalculationSalary {

    double calculateTax(Employee employee){
        double resultTax;
        double resultSalary;
        if(employee.getSalary() > 7000){
            resultTax = employee.getSalary() * employee.getTax()/100;
            resultSalary = employee.getSalary() - resultTax;
        } else {
            resultSalary = employee.getSalary();
        }

        return resultSalary;
    }

}
