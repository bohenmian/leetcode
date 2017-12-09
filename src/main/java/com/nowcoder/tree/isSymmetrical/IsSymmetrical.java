package com.nowcoder.tree.isSymmetrical;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */

public class IsSymmetrical {
    boolean isSymmetrical(TreeNode proot) {
        return isSymmetricalCore(proot, proot);
    }

    boolean isSymmetricalCore(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmetricalCore(root1.left, root2.right) && isSymmetricalCore(root1.right, root2.left);
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
