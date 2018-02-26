package com.nowcoder.tree.convert;

public class Solution {
    TreeNode leftLast = null;

    public TreeNode Convert(TreeNode root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null) {
            leftLast = root;
            return root;
        }
        TreeNode left = Convert(root.left);
        if (left != null) {
            leftLast.right = root;
            root.left = leftLast;
        }
        leftLast = root;
        TreeNode right = Convert(root.right);
        if (right != null) {
            right.left = root;
            root.right = right;
        }
        return left != null ? left : root;
    }


}

class TreeNode {
    int val;

    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
