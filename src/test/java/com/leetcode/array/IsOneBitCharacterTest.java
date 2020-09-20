package com.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IsOneBitCharacterTest {

    private final IsOneBitCharacter character = new IsOneBitCharacter();

    @Test
    public void should_return_the_is_one_bit_character() {
        boolean result = character.isOneBitCharacter(new int[]{1, 0, 0});
        assertTrue(result);
    }
}
