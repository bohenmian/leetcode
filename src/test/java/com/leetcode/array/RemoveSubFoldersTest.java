package com.leetcode.array;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveSubFoldersTest {

    private final RemoveSubFolders subFolders = new RemoveSubFolders();

    @Test
    public void should_remove_the_sub_folder() {
        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> result = subFolders.removeSubFolders(folder);
        List<String> expected = List.of("/a", "/c/d", "/c/f");
        assertEquals(expected, result);
    }
}
