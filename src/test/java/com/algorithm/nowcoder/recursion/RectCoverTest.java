package com.algorithm.nowcoder.recursion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RectCoverTest {
    private RectCover rectCover = new RectCover();

    @Test
    public void rectCover() throws Exception {
        int target = 3;
        int result = rectCover.RectCover(target);
        assertThat(result, is(3));
    }

}