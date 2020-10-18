package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.LinkedList;

public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        preOrder(root, builder);
        return builder.toString();
    }

    private void preOrder(TreeNode root, StringBuilder builder) {
        if (root == null) {
            builder.append("#").append(",");
            return;
        }
        builder.append(root.val).append(",");
        preOrder(root.left, builder);
        preOrder(root.right, builder);
    }

    public TreeNode deserialize(String data) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return deserialize(queue);
    }

    private TreeNode deserialize(LinkedList<String> queue) {
        String first = queue.pollFirst();
        if ("#".equals(first)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }
}
