package com.leetcode.dailyChallenge;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalcEquationTest {

    private final CalcEquation equation = new CalcEquation();

    @Test
    public void should_return_calc_equation() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"),
                List.of("cd", "bc"));
        double[] result = equation.calcEquation(equations, values, queries);
        double[] expected = {3.75000, 0.40000, 5.00000, 0.20000};
        assertArrayEquals(expected, result, 5);
    }
}
