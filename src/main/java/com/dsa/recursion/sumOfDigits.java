package com.dsa.recursion;

public class sumOfDigits {
    public static int digitSum(int num) {
        if(num == 0) return 0;
        return digitSum(num / 10) + (num % 10);
    }
    public static void main(String[] args) {
        int num = 12345;
        int ans = digitSum(num);

        System.out.println(ans);

    }
}
