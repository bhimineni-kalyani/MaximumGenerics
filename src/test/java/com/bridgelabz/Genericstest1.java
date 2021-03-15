package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class Genericstest1 {
    Generics1 MaxN;

    @Before
    public void set() throws Exception {
        MaxN = new Generics1();
    }

    @Test
    public void given_MaxNumberat_FirstPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(30, 20, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(10, 30, 20);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(30, 10, 20);
        Assert.assertEquals(30,result);
    }
}