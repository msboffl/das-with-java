package com.dsa.trees;

import java.util.ArrayList;
import java.util.List;

class PrintTreeNode {

    private final int data;
    private final List<PrintTreeNode> children;

    // Constructor
    public PrintTreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // Add child to current node
    public void addChild(PrintTreeNode child) {
        this.children.add(child);
    }

    // Print tree in tree-like format
    public void printTree(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "└── " : "├── ") + data);

        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);

            children.get(i).printTree(prefix + (isLast ? "    " : "│   "), lastChild);
        }
    }

    public static void main(String[] args) {
        PrintTreeNode root = new PrintTreeNode(1);
        PrintTreeNode n2 = new PrintTreeNode(2);
        PrintTreeNode n3 = new PrintTreeNode(3);
        PrintTreeNode n4 = new PrintTreeNode(4);
        PrintTreeNode n5 = new PrintTreeNode(5);
        PrintTreeNode n6 = new PrintTreeNode(6);
        PrintTreeNode n7 = new PrintTreeNode(7);

        // Tree structure:
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   6
        //         /
        //        7

        root.addChild(n2);
        root.addChild(n3);
        n2.addChild(n4);
        n2.addChild(n5);
        n3.addChild(n6);
        n6.addChild(n7);

        root.printTree("", true);
    }
}
