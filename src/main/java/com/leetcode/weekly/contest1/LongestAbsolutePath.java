package com.leetcode.weekly.contest1;
public class LongestAbsolutePath {
    public int lengthLongestPath(String input) {
        String[] paths = input.split("\n");
        int[] levelLen = new int[1000];
        int maxLen = 0;

        for (String path : paths) {
            int level = path.lastIndexOf("\t") + 1;
            String name = path.substring(level);

            if (level == 0) {
                levelLen[level] = name.length();
            } else {
                levelLen[level] = levelLen[level - 1] + name.length() + 1;
            }

            if (name.contains(".")) {
                maxLen = Math.max(maxLen, levelLen[level]);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestAbsolutePath obj = new LongestAbsolutePath();

        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(obj.lengthLongestPath(input)); // Output: 20
    }
}

