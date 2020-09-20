package com.leetcode.dailyChallenge;


public class SumRootToLeaf {

    public int sumRootToLeaf(TreeNode root) {
        return sumRoot(root, 0);
    }

    private int sumRoot(TreeNode root, int val) {
        if (root == null) return 0;
        val = (val * 2) + root.val;
        return root.left == root.right ? val : sumRoot(root.left, val) + sumRoot(root.right, val);
    }
}
