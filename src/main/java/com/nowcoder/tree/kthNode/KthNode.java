package com.nowcoder.tree.kthNode;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点,例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中,按结点数值大小顺序第三个结点的值为4.
 */

public class KthNode {

    int index = 0;//此处应该声明在此，声明在方法中每次都会重新置0

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null){
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null) {
                return node;
            }
            index++;
            if (index == k) {
                return pRoot;
            }
            node = KthNode(pRoot.right, k);
            if (node != null) {
                return node;
            }
        }
        return null;
    }
}

class TreeNode {

    int val = 0;

    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
