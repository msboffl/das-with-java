package com.dsa.recursion;

public class SumOfArray {
    public static int sum(int[] arr, int i) {
        if(i == arr.length) return 0;
        return arr[i] + sum(arr, i+1);
    }

    public static int sumOfArrayElements(int[] arr) {
        return sum(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int res = sumOfArrayElements(arr);
        System.out.println(res);
    }
}
