package com.dsa.recursion;

public class HeadRecursion {
    public static void printHead(int i) {
        if(i > 0) {
            printHead(i-1);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printHead(n);
    }
}
