package com.algorithm.leetcode.tree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        //如果一个树是对称的,那么它的左节点和右节点应该相等
        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
