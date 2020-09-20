package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionTest {

    private final CompareVersion version = new CompareVersion();

    @Test
    public void should_return_the_compare_version() {
        String version1 = "1.01";
        String version2 = "1.001";
        int result = version.compareVersion(version1, version2);
        assertEquals(0, result);
    }

    @Test
    public void should_return_the_compare_version_in_other_way() {
        String version1 = "7.5.2.4";
        String version2 = "7.5.3";
        int result = version.compareVersionInOtherWay(version1, version2);
        assertEquals(-1, result);
    }
}
