package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueensThatCanAttackTheKingTest {

    private QueensThatCanAttackTheKing attackTheKing = new QueensThatCanAttackTheKing();

    @Test
    public void should_return_the_coordinates_of_all_the_queens_that_can_attack_the_king() {
        int[][] queens = new int[][]{{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}};
        int[] king = {0, 0};
        List<List<Integer>> result = attackTheKing.queensAttackTheKing(queens, king);
        List<Integer> output1 = new ArrayList<>();
        output1.add(0, 1);
        List<Integer> output2 = new ArrayList<>();
        output2.add(1, 0);
        List<Integer> output3 = new ArrayList<>();
        output3.add(3, 3);
        List<List<Integer>> output = new ArrayList<>();
        output.add(output1);
        output.add(output2);
        output.add(output3);
        assertEquals(output, result);
    }

    @Test
    public void should_return_the_coordinates_of_all_queens_that_can_attack_the_king_in_other_test_case() {
        int[][] queens = new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}};
        int[] king = new int[]{3, 3};
        List<List<Integer>> result = attackTheKing.queensAttackTheKing(queens, king);
        List<Integer> output1 = new ArrayList<>();
        output1.add(2, 2);
        List<Integer> output2 = new ArrayList<>();
        output2.add(3, 4);
        List<Integer> output3 = new ArrayList<>();
        output3.add(4, 4);
        List<List<Integer>> output = new ArrayList<>();
        output.add(output1);
        output.add(output2);
        output.add(output3);
        assertEquals(output, result);
    }

    @Test
    public void should_return_the_coordinates_of_all_queens_that_can_attack_the_king_in_more_test_case() {
        int[][] queens = new int[][]{{5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3}, {4, 0},
                {1, 2}, {6, 3}, {5, 0}, {0, 4}, {2, 2}, {1, 1}, {6, 4}, {5, 4}, {0, 0}, {2, 6}, {4, 5},
                {5, 2}, {1, 4}, {7, 5}, {2, 3}, {0, 5}, {4, 2}, {1, 0}, {2, 7}, {0, 1},
                {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}};
        int[] king = {3, 4};

        int[][] result = attackTheKing.queensAttackTheKing(queens, king)
                .stream()
                .map(u -> u.stream().mapToInt(i -> i).toArray())
                .toArray(int[][]::new);


    }
}
