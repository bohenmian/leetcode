package com.leetcode.dailyChallenge;

public class MaxAncestorDiff {

    int result = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        if ( root == null) return 0;
        maxAncestorDiffHelper(root, root.val, root.val);
        return result;
    }

    private void maxAncestorDiffHelper(TreeNode node, int max, int min) {
        if (node == null) return;
        max = Math.max(node.val, max);
        min = Math.min(node.val, min);

        if (node.left == null && node.right == null) {
            result = Math.max(max - min, result);
        }

        maxAncestorDiffHelper(node.left, max, min);
        maxAncestorDiffHelper(node.right, max, min);
    }
}
