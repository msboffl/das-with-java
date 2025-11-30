package com.dsa.recursion;

public class SumOfNaturals {
    public static int sumOfNumbers(int i) {
        if(i == 1) return 1;
        return i + sumOfNumbers(i-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNumbers(n));
    }
}