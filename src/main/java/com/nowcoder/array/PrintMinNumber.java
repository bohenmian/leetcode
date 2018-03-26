package com.nowcoder.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {

    public String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arrayList.add(numbers[i]);
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2; //Integer转换为String
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder s = new StringBuilder("");
        for (int i : arrayList) {
            s = s.append(i);
        }
        return String.valueOf(s);
    }
}
