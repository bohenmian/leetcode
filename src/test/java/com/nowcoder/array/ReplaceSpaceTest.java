package com.nowcoder.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReplaceSpaceTest {

    private ReplaceSpace replaceSpace = new ReplaceSpace();

    @Test
    public void replaceSpace() throws Exception {
        StringBuffer str = new StringBuffer("We Are Happy");
        String result = replaceSpace.replaceSpace(str);
        assertThat(result, is("We%20Are%20Happy"));
    }

}