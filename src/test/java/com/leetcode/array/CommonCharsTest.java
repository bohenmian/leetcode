package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonCharsTest {

    private final CommonChars commonChars = new CommonChars();

    @Test
    public void should_return_the_common_chars() {
        List<String> list = commonChars.commonChars(new String[]{"bella", "label", "roller"});
        List<String> expected = Arrays.asList("e", "l", "l");
        assertEquals(expected, list);
    }
}
