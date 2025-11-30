package com.dsa.recursion;

public class Palindrome {
    public static boolean checkPalindrome(String str, int left, int right) {
        if(left >= right) return true;

        if(str.charAt(left) != str.charAt(right)) return false;

        return checkPalindrome(str, left +1, right-1);

    }

    public static void main(String[] args) {
        String str = "aba";

        boolean ans = checkPalindrome(str, 0, str.length()-1);

        System.out.println(ans);
    }
}
