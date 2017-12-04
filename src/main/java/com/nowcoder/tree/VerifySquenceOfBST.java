package com.nowcoder.tree;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return VerifySquenceOfBSTCore(sequence, sequence.length);
    }

    private boolean VerifySquenceOfBSTCore(int[] sequence, int length) {
        int root = sequence[length - 1];
        int i = 0;
        for (; i < length - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i;
        for (; j < length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }
        boolean left = true;
        if (i > 0) {
            left = VerifySquenceOfBSTCore(sequence, i);
        }
        boolean right = true;
        if (i < length - 1) {
            right = VerifySquenceOfBSTCore(sequence, length - 1 - i);
        }
        return (left && right);
    }
}
