package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Genericstest3 {
    Generics3 MaxN;
    private Assertions Assert;

    public void set() throws Exception {
        MaxN = new Generics3();
    }
    @Test
    public void given_MaxStringat_FirstPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Apple", "Orange", "Grapes");
        Assert.assertEquals("Apple", result);
    }

    @Test
    public void given_MaxStringat_SecondPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Apple","Grapes","Orange");
        Assert.assertEquals("Apple", result);
    }

    @Test
    public void given_MaxStringat_ThirdPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Orange", "Apple", "Grapes");
        Assert.assertEquals("Apple", result);
    }
}