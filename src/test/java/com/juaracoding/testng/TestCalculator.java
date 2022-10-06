package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    @Parameters({"angkaPertama", "angkaKedua"})
    public void testAdd(int angkaPertama, int angkakedua) {
        Calculator calculator = new Calculator();
        int actual = calculator.add(angkaPertama, angkakedua);
        int expect = 15;
        Assert.assertEquals(actual, expect);
        System.out.println(actual);
    }

    @Test
    @Parameters({"angkaPertama", "angkaKedua"})
    public void testSubstract(int angkaPertama, int angkakedua) {
        Calculator calculator = new Calculator();
        int actual = calculator.substract(angkaPertama, angkakedua);
        int expect = 5;
        Assert.assertEquals(actual, expect);
        System.out.println(actual);
    }

    //Jenis result testing failed
//    @Test
//    public void testAssertTrue() {
//        boolean angka = 15>15;
//        Assert.assertTrue(angka);
//        String actual = "Data tidak berhasil disimpan";
//        String expect = "Data berhasil disimpan";
//        //Validasi
//        Assert.assertTrue(actual.equals(expect),"Test Gagal");
//    }

    //Jenis result testing success
    @Test
    @Parameters("text")
    public void testAssertTrueDua(String text) {
        String a = "Data berhasil disimpan";
        String b = "Data berhasil disimpan";
        System.out.println(text);
        Assert.assertTrue(a.equals(b));
    }





}
