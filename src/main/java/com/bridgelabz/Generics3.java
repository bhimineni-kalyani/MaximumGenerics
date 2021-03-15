package com.bridgelabz;

public class Generics3 {
    public String getStringMaximum(String S1, String S2, String S3) {
        if (S1.compareTo(S2) > 0 && S1.compareTo(S3) > 0)
            return S1;
        else if (S2.compareTo(S3) > 0 && S2.compareTo(S1) > 0)
            return S2;
        else
            return S3;
    }
}