package com.leetcode.array;

import java.util.List;
import org.junit.Test;

public class SubsetsTest {

    private final Subsets subsets = new Subsets();

    @Test
    public void should_return_all_subset() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = this.subsets.subsets(nums);
    }
}
