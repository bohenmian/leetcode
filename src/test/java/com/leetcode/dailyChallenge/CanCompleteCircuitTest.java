package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanCompleteCircuitTest {

    private final CanCompleteCircuit circuit = new CanCompleteCircuit();

    @Test
    public void should_return_whether_can_complete_circuit() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = circuit.canCompleteCircuit(gas, cost);
        assertEquals(result, 3);
    }
}
