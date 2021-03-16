package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Genericstest4 {

    @Test
    public void given_integers_check_maximum() {
        Generics4<Integer> max = new Generics4<>(23, 28, 38, 83, 99);
        int result = max.maximum();
        Assertions.assertEquals(99, result);
    }

    @Test
    public void given_float_check_maximum() {
        Generics4<Double> max = new Generics4<>(23.00, 28.00, 23.28, 38.1999, 99.9999);
        double result = max.maximum();
        Assertions.assertEquals(99.9999, result, 1e-15);
    }

    @Test
    public void given_strings_check_maximum() {
        Generics4<String> max = new Generics4<>("Bhimineni", "Kalyani", "Bujji", "Chinni", "Thalli");
        String result = max.maximum();
        Assertions.assertEquals("Thalli", result);
    }
}