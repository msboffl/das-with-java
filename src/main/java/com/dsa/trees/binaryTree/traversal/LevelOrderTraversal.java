package com.dsa.trees.binaryTree.traversal;

import com.dsa.trees.binaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class LevelOrderTraversal {
    static void levelOrderTraversal(BinaryTreeNode node, int level, ArrayList<ArrayList<Integer>> ans) {
        if(node == null) return;

        if(level == ans.size()) {
            ans.add(new ArrayList<>());
        }

        ArrayList<Integer> currentList = ans.get(level);
        currentList.add(node.data);
        levelOrderTraversal(node.left, level + 1, ans);
        levelOrderTraversal(node.right, level + 1, ans);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);

        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);

        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        levelOrderTraversal(root,0, ans);

        System.out.print("Level order traversal : " + ans);
    }
}
