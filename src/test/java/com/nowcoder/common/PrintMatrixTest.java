package com.nowcoder.common;

import org.junit.Test;

import java.util.ArrayList;

public class PrintMatrixTest {

    private PrintMatrix printMatrix = new PrintMatrix();

    @Test
    public void test_printMatrix_when_success() throws Exception {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ArrayList list = printMatrix.printMatrix(matrix);
        Object[] arrayList = list.toArray();
        for (int i = 0 ;i<arrayList.length;i++) {
            System.out.println(arrayList[i]);
        }
    }
}