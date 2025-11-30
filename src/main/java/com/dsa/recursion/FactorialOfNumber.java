package com.dsa.recursion;

public class FactorialOfNumber {
    public static int factorial(int i) {
        if(i == 1) return 1;
        return i * factorial(i-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }
}
