package com.nowcoder.string;

public class ReverseSentence {

    public static String ReverseSentence(String str) {
        if (str == null || str.trim().equals("")) {

            return str;
        }
        String[] words = str.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            buffer.append(reserve(words[i].toCharArray(), 0, words[i].length() - 1)).append(" ");
        }
        if (buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        return reserve(buffer.toString().toCharArray(), 0, buffer.length() - 1);
    }

    private static String reserve(char[] array, int start, int end){
        while (start < end) {
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String s = "I am a student.";
        System.out.println(ReverseSentence(s));
    }
}
