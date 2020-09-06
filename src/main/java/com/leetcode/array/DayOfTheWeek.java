package com.leetcode.array;

public class DayOfTheWeek {

    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekStr = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // 1970-01-01 is Thursday
        int sum = 4;
        if (year > 1971)
            for (int i = 1971; i < year; i++) {
                sum += 365;
                // leap year
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) sum++;
            }
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) sum += months[i];
        // leap year
        if (month >= 3 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) sum++;
        sum += day;
        return weekStr[sum % 7];
    }

}
