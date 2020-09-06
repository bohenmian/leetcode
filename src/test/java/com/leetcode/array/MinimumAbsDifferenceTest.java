package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumAbsDifferenceTest {

    private final MinimumAbsDifference difference = new MinimumAbsDifference();

    @Test
    public void should_return_the_new_list() {
        List<List<Integer>> result = difference.minimumAbsDifference(new int[]{4, 2, 1, 3});
        List<List<Integer>> expected = new ArrayList<>();
        IntStream.range(1, 4).forEach(i -> {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(i + 1);
                    expected.add(list);
                }
        );
        assertEquals(expected, result);
    }
}
