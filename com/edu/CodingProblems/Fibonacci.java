package com.edu.CodingProblems;

/**
 * Created by biyengar on 1/8/17.
 */

class Fibonacci {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 1000;
        System.out.print(n1 + n2); //0 and 1

        for (i = 2; i < count; ++i) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }


    }
}

