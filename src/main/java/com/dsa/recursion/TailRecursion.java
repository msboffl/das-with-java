package com.dsa.recursion;

public class TailRecursion {
    public static void printTail(int i) {
        if(i > 0) {
            System.out.println(i);
            printTail(i - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printTail(n);
    }
}