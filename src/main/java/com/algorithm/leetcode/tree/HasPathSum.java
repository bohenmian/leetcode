package com.algorithm.leetcode.tree;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */

public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;

        //到根节点的判断条件
        if (sum == 0 && root.left == null && root.right == null) {
            return true;
        }

        boolean leftPath = hasPathSum(root.left, sum);
        boolean rightPath = hasPathSum(root.right, sum);

        return leftPath || rightPath;
    }
}
