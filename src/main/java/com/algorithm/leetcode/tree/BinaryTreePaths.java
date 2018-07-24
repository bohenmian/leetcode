package com.algorithm.leetcode.tree;


import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        searchPath(list, root, "");
        return list;
    }

    private void searchPath(List<String> list, TreeNode root, String connection) {
        if (root.left == null && root.right == null) {
            list.add(connection + root.val);
        }
        if (root.left != null) {
            searchPath(list, root.left, connection + root.val + "->");
        }
        if (root.right != null) {
            searchPath(list, root.right, connection + root.val + "->");

        }
    }
}
