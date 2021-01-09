package com.leetcode.dailyChallenge;

public class FindTilt {

    int sum = 0;
    public int findTilt(TreeNode root) {
        findTiltHelper(root);
        return sum;
    }

    private int findTiltHelper(TreeNode root) {
        if (root == null) return 0;
        int left = findTiltHelper(root.left);
        int right = findTiltHelper(root.right);
        sum += Math.abs(right - left);
        return left + right + root.val;
    }
}
