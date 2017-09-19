package com.nowcoder.array;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int numberOfBlank = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == ' ') {
                numberOfBlank++;
            }
        }
        int newLength = str.length() + numberOfBlank * 2;
        int indexOfOriginal = str.length() - 1;
        int indexOfNew = newLength - 1;
        str.setLength(newLength);
        for (; indexOfOriginal >= 0 && indexOfOriginal < indexOfNew ; --indexOfOriginal ) {
            if (str.charAt(indexOfOriginal) == ' ') {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            } else {
                str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
            }
        }
        return str.toString();
    }
}
