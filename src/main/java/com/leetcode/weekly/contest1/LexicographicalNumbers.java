package com.leetcode.weekly.contest1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalNumbers {
    public List<String> lexicalOrder(int n) {
        List<String> temp = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            temp.add(Integer.toString(i));
        }
        return temp;
    }
    public static void main(String[] args) {
        LexicographicalNumbers lexicographicalNumbers = new LexicographicalNumbers();
        List<String> ans = lexicographicalNumbers.lexicalOrder(13);

        Collections.sort(ans);
        System.out.println(ans);


    }
}
