package com.chinahadoop.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotateStringTest {

    private LeftRotateString leftRotateString = new LeftRotateString();

    @Test
    public void test_leftRotateString_when_string_not_null() throws Exception {
        String s = "abcdef";
        String result = leftRotateString.ReverseString(s, 6, 2);
        assertEquals(result, "cdefab");
    }

    @Test
    public void test_leftRotateString_when_string_is_null() throws Exception {
        String s = null;
        String result = leftRotateString.ReverseString(s, 6, 2);
        assertNull(result);
    }
}