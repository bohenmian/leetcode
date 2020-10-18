package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfExistTest {

    private final CheckIfExist ifExist = new CheckIfExist();

    @Test
    public void should_check_if_exist() {
        int[] arr = {-10, 12, -20, -8, 15};
        boolean result = ifExist.checkIfExist(arr);
        assertTrue(result);
    }
}
