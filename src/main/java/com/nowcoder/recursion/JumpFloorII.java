package com.nowcoder.recursion;

public class JumpFloorII {

    public int JumpFloorII(int target) {
        int result = 0;
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return target;
        } else {
            result = 2 * JumpFloorII(target - 1);
            return result;
        }
    }
}
