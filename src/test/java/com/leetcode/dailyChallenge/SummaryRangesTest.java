package com.leetcode.dailyChallenge;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummaryRangesTest {

    private final SummaryRanges ranges = new SummaryRanges();

    @Test
    public void should_return_the_summary_range() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = ranges.summaryRanges(nums);
        List<String> expected = List.of("0->2", "4->5", "7");
        assertEquals(expected, result);
    }
}
