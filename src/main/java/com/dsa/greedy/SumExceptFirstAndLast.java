package com.dsa.greedy;

public class SumExceptFirstAndLast {
    private static int sumOfNumbers(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for(int i = 1; i < n-1; i++) {
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int ans1 = sumOfNumbers(arr1);
        System.out.println(ans1); // 9

        int[] arr2 = {5, 10};
        int ans2 = sumOfNumbers(arr2);
        System.out.println(ans2); // 0
    }
}
