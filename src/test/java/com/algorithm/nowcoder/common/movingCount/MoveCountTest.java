package com.algorithm.nowcoder.common.movingCount;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveCountTest {

    private MoveCount moveCount = new MoveCount();

    @Test
    public void moveCount() throws Exception {
        int rows = 10;
        int cols = 10;
        int threshold = 5;
        int result = moveCount.movingCount(threshold, rows, cols);
        assertEquals(result, 21);

    }

}