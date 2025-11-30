package com.dsa.recursion;

import java.util.Arrays;

public class MinAndMaxOfArray {
    private static int findMin(int[] nums, int index) {
        if(index == nums.length-1) return nums[index];
        return Math.max(nums[index], findMin(nums, index+1));
    }

    private static int findMax(int[] nums, int index) {
        if(index == nums.length-1) return nums[index];
        return Math.min(nums[index], findMax(nums, index+1));
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int max = findMax(arr, 0);
        int min = findMin(arr, 0);

        int[] ans = {max, min};

        System.out.println(Arrays.toString(ans));
    }
}
