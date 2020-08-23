package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class BusyStudentTest {

    private final BusyStudent busyStudent = new BusyStudent();

    @Test
    public void should_return_the_busy_student_when_query_time_is_do_homework() {
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;
        int student = busyStudent.busyStudent(startTime, endTime, queryTime);
        assertEquals(1, student);
    }
}
