package com.algorithm.nowcoder.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheReversePairCountTest {

    private final FindTheReversePairCount count = new FindTheReversePairCount();

    @Test
    public void should_return_the_reverse_pair_count() {
        int[] arr = {88, 71, 16, 2, 72, 38, 94, 50, 72, 67};
        long result = count.findTheReversePairCount(arr);
        assertEquals(21, result);
    }
}
