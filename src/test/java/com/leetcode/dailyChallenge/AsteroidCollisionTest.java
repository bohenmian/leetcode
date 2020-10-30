package com.leetcode.dailyChallenge;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AsteroidCollisionTest {

    private final AsteroidCollision collision = new AsteroidCollision();

    @Test
    public void should_return_the_asteroid_collision() {
        int[] result = collision.asteroidCollision(new int[]{5, 10, -5});
        int[] expected = {5, 10};
        assertArrayEquals(expected, result);
    }
}
