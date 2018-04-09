package com.algorithm.nowcoder.tree.solution3;

public class Solution3 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
        return true;
        }
//        int leftDep = 0;
//        int rightDep = 0;
        int leftDep = depth(root.left);
        int rightDep = depth(root.right);
        int diff = leftDep - rightDep;
        if (diff < -1 || diff > 1) {
            return false;
        }
        boolean boolLeft = IsBalanced_Solution(root.left);
        boolean boolRight = IsBalanced_Solution(root.right);
        return boolLeft && boolRight;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        return (left > right ? left : right) + 1;
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
