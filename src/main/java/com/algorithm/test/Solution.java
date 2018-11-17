package com.algorithm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.trim().split(",");
        int maxWidth = scanner.nextInt();
        List list = fullJustify(words, maxWidth);
        for (Object word : list) {
            System.out.println(word);
        }
    }

    public static List fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int lineLen = 0;
        if (maxWidth == 0) {
            result.add("");
            return result;
        }

        for (String word : words) {
            if (lineLen + word.length() + 1 <= maxWidth + 1) {
                line.add(word + " ");
                lineLen = lineLen + word.length() + 1;
            } else {
                for (int j = 0; j < maxWidth - lineLen + 1; j++) {
                    int index = 0;
                    if (line.size() != 1)
                        index = j % (line.size() - 1);
                    String s = line.get(index) + " ";
                    line.set(index, s);
                }
                StringBuilder r = new StringBuilder();
                for (String aLine : line)
                    r.append(aLine);
                r = new StringBuilder(r.substring(0, r.length() - 1));
                result.add(r.toString());

                line.clear();
                line.add(word + " ");
                lineLen = word.length() + 1;
            }
        }

        if (line.size() != 0)   //对于最后一行特殊处理，单词间不留空格
        {
            StringBuilder r = new StringBuilder();
            for (String aLine : line)
                r.append(aLine);

            r = new StringBuilder(r.substring(0, r.length() - 1));
            for (int i = r.length(); i < maxWidth; i++)
                r.append(" ");

            result.add(r.toString());
        }
        return result;
    }
}
