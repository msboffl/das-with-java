package com.dsa.trees.binaryTree.traversal;

import com.dsa.trees.binaryTree.BinaryTreeNode;

public class PostOrderTraversal {
    static void postOrderTraversal(BinaryTreeNode node) {
        if(node == null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");

    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);

        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);

        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        System.out.print("In order traversal : ");
        postOrderTraversal(root);
    }

}
