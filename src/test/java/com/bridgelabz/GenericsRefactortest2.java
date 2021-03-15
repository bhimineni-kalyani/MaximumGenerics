package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class GenericsRefactortest2 {
    private GenericsRefactor MaxN;

    @Test
    public void given_MaxNumberat_FirstPosition_Returns_True_Test() {
        int result = MaxN.getMaximum(10, 20, 30);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result = MaxN.getMaximum(20, 30, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = MaxN.getMaximum(30, 20, 10);
        Assert.assertEquals(30,result);
    }
    @Test
    public void given_MaxDoubleat_FirstPosition_Returns_True_Test() {
        double result = MaxN.getMaximum(10.0, 20.0, 30.0);
        Assert.assertEquals(30.0, result, 0.001);
    }

    @Test
    public void given_MaxDoubleat_SecondPosition_Returns_True_Test() {
        double result = MaxN.getMaximum(20.0,30.0,10.0);
        Assert.assertEquals(30.0, result,0.001);
    }

    @Test
    public void given_MaxDoubleat_ThirdPosition_Returns_True_Test() {
        double result = MaxN.getMaximum(30.0,20.0,10.0);
        Assert.assertEquals(30.0,result,0.001);
    }

    @Test
    public void given_MaxStringat_FirstPosition_Returns_True_Test() {
        String result = MaxN.getMaximum("Apple", "Orange", "Grapes");
        Assert.assertEquals("Apple", result);
    }

    @Test
    public void given_MaxStringat_SecondPosition_Returns_True_Test() {
        String result = MaxN.getMaximum("Apple","Grapes","Orange");
        Assert.assertEquals("Apple", result);
    }

    @Test
    public void given_MaxStringat_ThirdPosition_Returns_True_Test() {
        String result = MaxN.getMaximum("Orange", "Apple", "Grapes");
        Assert.assertEquals("Apple", result);
    }
}