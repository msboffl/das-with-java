package com.dsa.trees.binaryTree;

import java.util.TreeSet;

public class BinaryTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.println(ts);

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(4);

        System.out.println(ts);
    }
}
