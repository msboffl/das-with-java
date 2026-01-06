package com.practice;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        int count = 0;
        int evenSum = 0;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            }
            sum += arr[i];
           count++; // count += 1; count = count + 1
        }

        System.out.println(sum);
        System.out.println(count);
        System.out.println(evenSum);

    }
}
