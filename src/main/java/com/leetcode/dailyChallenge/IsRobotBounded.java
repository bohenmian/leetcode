package com.leetcode.dailyChallenge;

public class IsRobotBounded {

    public boolean isRobotBounded(String instructions) {
        // up -> 0, right -> 1, down->2, left->3
        int direction = 0;
        int x = 0;
        int y = 0;
        char ch;
        for (int i = 0; i < instructions.length(); i++) {
            ch = instructions.charAt(i);
            if (ch == 'L') {
                if (direction == 0) direction = 3;
                else direction--;
            }
            if (ch == 'R') {
                if (direction == 3) direction = 0;
                else direction++;
            }
            if (ch == 'G') {
                switch (direction){
                    case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                }
            }
        }
        if (x == 0 && y == 0) return true;
        return direction != 0;
    }
}
