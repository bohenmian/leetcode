package com.nowcoder.array;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 * 首先遍历数组并进行异或运算得到两个只出现一次数字的异或结果(两个相同数字异或结果为0),通过异或结果求出最右一位为1的下标
 * 通过下标来重新划分原数组为两个子数组,两个子数组在重新进行一个异或运算得到结果
 */

public class FindNumsAppearOnce {

    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        int length = array.length;
        if (length < 2) {
            throw new RuntimeException("parameter illegal");
        } else if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
        }
        int bitResult = 0;
        for (int i = 0; i < array.length; i++) {
            bitResult ^= array[i];
        }
        //找到第一个1的位置
        int index = findFirst1(bitResult);
        for (int i = 0; i < array.length; i++) {

            //重新划分子数组
            if (isBit1(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }

    private int findFirst1(int bitResult) {
        int index = 0;
        //如果最右一位不为0,则右移一位,高位用0填充
        while ((bitResult & 1) == 0) {
            bitResult >>= 1;
            index++;
        }
        return index;
    }

    private boolean isBit1(int num, int index) {
        num >>= index;
        return (num & 1) == 1;
    }
}
