package com.leetcode.dailyChallenge;

public class InsertIntoBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode curr = root;
        while (true) {
            if (val < curr.val) {
                if (curr.left != null) curr = curr.left;
                else {
                    curr.left = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.right != null) curr = curr.right;
                else {
                    curr.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public TreeNode insertIntoBSTOtherWay(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val) root.left = insertIntoBSTOtherWay(root.left, val);
        else root.right = insertIntoBSTOtherWay(root.right, val);
        return root;
    }
}
