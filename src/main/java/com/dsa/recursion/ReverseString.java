package com.dsa.recursion;

public class ReverseString {
    public static String reverseString(String str) {
        if(str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        String res = reverseString(str);

        System.out.println(res);
    }
}
