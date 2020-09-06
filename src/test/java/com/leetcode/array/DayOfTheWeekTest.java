package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekTest {

    private final DayOfTheWeek week = new DayOfTheWeek();

    @Test
    public void should_return_the_day_of_the_week() {
        String result = week.dayOfTheWeek(3, 9, 2020);
        String expected = "Thursday";
        assertEquals(expected, result);
    }
}
