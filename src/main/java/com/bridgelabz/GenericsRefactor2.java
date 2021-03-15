package com.bridgelabz;

public class GenericsRefactor2<A extends Comparable<A>> {
    A  K, L, M;
    private GenericsRefactor GenericsReactor2;

    public GenericsRefactor2(A K,A L,A M) {
        this.K = K;
        this.L = L;
        this.M = M;
    }

    public A maximum() {
        return GenericsReactor2.getMaximum(K,L,M);
    }

    public <A extends Comparable<A>> A getMaximum(A K, A L, A M) {
        if (K.compareTo(L) > 0 && K.compareTo(M) > 0)
            return K;
        else if (L.compareTo(M) > 0 && L.compareTo(K) > 0)
            return L;
        else
            return M;
    }
}