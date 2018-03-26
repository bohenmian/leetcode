package com.nowcoder.array;

public class Multiply {

    public static int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length != 0) {
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            for (int j = length - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = multiply(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        int[] x = new int[5];
        System.out.println(x.length);
    }
}
