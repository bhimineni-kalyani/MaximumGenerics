package com.bridgelabz;

public class GenericsRefactor {
    public <A extends Comparable<A>> A getMaximum(A K, A L, A M) {
        if (K.compareTo(L) > 0 && K.compareTo(M) > 0)
            return K;
        else if (L.compareTo(M) > 0 && L.compareTo(K) > 0)
            return L;
        else
            return M;
    }
}