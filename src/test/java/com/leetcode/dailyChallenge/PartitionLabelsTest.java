package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionLabelsTest {

    private final PartitionLabels labels = new PartitionLabels();

    @Test
    public void should_return_the_partition_label() {
        List<Integer> list = labels.partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(Arrays.asList(9, 7, 8), list);
    }
}
