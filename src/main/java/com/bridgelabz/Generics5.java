package com.bridgelabz;

import java.util.Arrays;

public class Generics5<B extends Comparable<B>> {
    B[] items;

    @SafeVarargs
    public Generics5(B...items) {
        this.items=items;
    }

    public <B extends Comparable<B>> B maximum() {
        B max;
        Arrays.sort(items);
        max= (B) items[items.length-1];
        printMaximum(max);
        return max;
    }

    public static <B> void printMaximum(B max) {
        System.out.println("Maximum : " +max);
    }
}