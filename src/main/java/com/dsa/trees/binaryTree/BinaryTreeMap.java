package com.dsa.trees.binaryTree;

import java.util.Map;
import java.util.TreeMap;

public class BinaryTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        System.out.println(tm);

        // Adding Elements
        tm.put("A", 1);
        tm.put("B", 2);
        tm.put("D", 4);
        tm.put("C", 3);

        System.out.println(tm);

        // Changing Elements
        tm.put("A", 0);
        System.out.println(tm);

        // Deleting Elements
        tm.remove("C");
        System.out.println(tm);

        for (Map.Entry<String, Integer> e: tm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
