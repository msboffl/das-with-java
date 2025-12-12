package com.dsa.trees.binaryTree.traversal;

import com.dsa.trees.binaryTree.BinaryTreeNode;


public class MaxDepthOfTree {
    static int heightOfTree(BinaryTreeNode node) {
        if(node == null) return -1;

        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);

        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);

        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        System.out.println(heightOfTree(root));
    }
}
