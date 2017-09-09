package com.nowcoder.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReplaceSpaceTest {

    private ReplaceSpace replaceSpace = new ReplaceSpace();

    @Test
    public void test_replaceSpace_when_not_exit_space() throws Exception {
        StringBuffer str = new StringBuffer("We");
        String result = replaceSpace.replaceSpace(str);
        assertThat(result, is("We"));
    }

    @Test
    public void test_replaceSpace_when_has_space() throws Exception {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        String result = replaceSpace.replaceSpace(stringBuffer);
        assertThat(result, is("We%20Are%20Happy"));
    }

}