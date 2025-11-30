package com.leetcode.weekly.contest1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChars {
    public int uniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstUniqueChars firstUniqueChars = new FirstUniqueChars();

        String s = "leetcode";
        int ans = firstUniqueChars.uniqChar(s);

        System.out.println(ans);
    }
}
