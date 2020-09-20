package com.leetcode.array;

/**
 * 1. 先判断A, B到底谁赢了，在判断Pending和Draw的case
 * 2. A, B谁赢只和最后一步落棋有关，如果在前面有个落器赢了，那么游戏结束不会有后面的情况
 * 3. 用count记录表示所有能win的case, 0,1,2记录行. 3,4,5记录列, 6记录对角线, 7记录副对角线
 * 4. 从最后一步落棋记录, 判断最后落棋选手每一步棋对行,列,对角线,副对角线的影响
 * 5. 3 X 3 的棋盘win的条件就是这一列有3个。所以判断count[] = 3
 */

public class Tictactoe {

    public String tictactoe(int[][] moves) {
        // 用来记录win的条件，分别是行，列，对角线，副对角线
        int[] count = new int[8];
        for (int i = moves.length - 1; i >= 0; i -= 2) {
            // 对行的影响
            count[moves[i][0]]++;

            // 对列的影响
            count[moves[i][1] + 3]++;

            // 对对角线的影响 对角线i = j([0,0], [1,1], [2,2])
            if (moves[i][0] == moves[i][1]) {
                count[6]++;
            }

            // 副对角线的影响i + j = 2([0,2],[1,1],[2,0])
            if (moves[i][0] + moves[i][1] == 2) {
                count[7]++;
            }
            if (count[moves[i][0]] == 3 || count[moves[i][1] + 3] == 3
                    || count[6] == 3 || count[7] == 3) {
                return moves.length % 2 == 0 ? "B" : "A";
            }
        }
        if (moves.length < 9) {
            return "Pending";
        }
        return "Draw";
    }


    public String tictactoeOtherWay(int[][] moves) {
        // 000000111, 000111000, 111000000
        // 100100100, 010010010, 001001001
        // 100010001, 001010100
        int[] winCase = {7, 56, 448, 73, 146, 292, 273, 84};
        int a = 0;
        int b = 0;
        for (int i = 0; i < moves.length; i++) {
            if ((i & 1) == 1) {
                // 找到棋盘对应二进制数组中的位置
                b ^= 1 << 3 * moves[i][0] + moves[i][1];
            } else {
                a ^= 1 << 3 * moves[i][0] + moves[i][1];
            }
        }
        for (int value : winCase) {
            //
            if ((a & value) == value) {
                return "A";
            }
            if ((b & value) == value) {
                return "B";
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

}
