package com.javaPlus.dataStructure.bitmap;


public class BitMap {

    // 假设这里是int类型的数据,int类型的数据是32个bit位
    private static final int BITS_PER_WORD = 32;

    // int类型的bitmap只有最后5位会改变 BITS_PER_WORD = 2 ^ SHIFT
    private static final int SHIFT = 5;

    // 假设有10000000个数字
    int n = 10000000;

    // 初始化bitmap数组
    int[] bits = new int[1 + n / BITS_PER_WORD];

    /**
     *
     * 设置所在的bit位为1
     * i >> SHIFT相当于求这个数在数组中的下标,等价于i/2^SHIFT
     * 1 << (i & ((int) Math.pow(2, SHIFT) - 1)) 设置数组该下表中对应bit位为1, i & ((int) Math.pow(2, SHIFT) - 1))相当于 i % 2 ^ SHIFT
     * @param i 将要转换的数字
     */
    public void setBit(int i) {
        bits[i >> SHIFT] |= 1 << (i & ((int) Math.pow(2, SHIFT) - 1));
    }

    // 初始化所有bit位为0
    public void clearBit(int i) {
        bits[i >> SHIFT] &= ~(1 << (i & ((int) Math.pow(2, SHIFT) - 1)));
    }

    // 测试该bit位是否为1
    public int test(int i) {
        return bits[i >> SHIFT] & (1 << (i & ((int) Math.pow(2, SHIFT) - 1)));
    }
}
