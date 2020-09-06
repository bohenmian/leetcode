package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class XorOperationTest {

    private final XorOperation operation = new XorOperation();

    @Test
    public void should_return_the_operation() {
        int result = operation.xorOperation(5, 0);
        assertEquals(8, result);

        int result1 = operation.xorOperation(4, 3);
        assertEquals(8, result1);
    }
}
