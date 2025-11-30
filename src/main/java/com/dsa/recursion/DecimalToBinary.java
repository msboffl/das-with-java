package com.dsa.recursion;

public class DecimalToBinary {
    public static String decToBin(int num) {
        if(num == 0) return "0";
        if(num == 1) return "1";

        return  decToBin(num / 2) + num % 2;
    }
    public static void main(String[] args) {
        int number = 1048576;
        String ans = decToBin(number);

        System.out.println(ans);
    }
}
