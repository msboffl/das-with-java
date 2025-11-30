package com.dsa.recursion;

public class MeanOfArray {
    private static int findMeanOfArray(int[] nums, int index) {
        if(nums.length == index) return 0;

        return nums[index] + findMeanOfArray(nums, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int ans = findMeanOfArray(arr, 0) / arr.length;

        System.out.println(ans);
    }
}
