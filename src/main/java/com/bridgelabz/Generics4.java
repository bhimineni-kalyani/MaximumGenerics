package com.bridgelabz;

import java.util.Arrays;

public class Generics4<B extends Comparable<B>> {
    B[] items;

    @SafeVarargs
    public Generics4(B...items) {
        this.items=items;
    }

    public <B extends Comparable<B>> B maximum() {
        Arrays.sort(items);
        return (B) items[items.length-1];
    }
}