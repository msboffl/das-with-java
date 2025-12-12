package com.dsa.trees.binaryTree;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);

        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
    }
}
