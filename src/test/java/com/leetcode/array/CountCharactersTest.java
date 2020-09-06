package com.leetcode.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountCharactersTest {

    private final CountCharacters countCharacters = new CountCharacters();

    @Test
    public void should_return_the_word_length() {
        String chars = "atach";
        String[] words = new String[]{"cat", "bt", "hat", "tree"};
        int result = countCharacters.countCharacters(words, chars);
        assertEquals(6, result);
    }

    @Test
    public void should_return_the_count_word_length() {
        String chars = "welldonehoneyr";
        String[] words = new String[]{"hello", "world", "leetcode"};
        int result = countCharacters.countCharacters(words, chars);
        assertEquals(10, result);
    }
}
