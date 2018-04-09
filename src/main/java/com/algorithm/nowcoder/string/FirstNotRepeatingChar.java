package com.algorithm.nowcoder.string;


import java.util.LinkedHashMap;

public class FirstNotRepeatingChar {

    public int FirstNotRepeatingChar(String str) {
        if (str.isEmpty()) {
            throw new RuntimeException("parameter illegal");
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i), ++time);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        int result = -1;
        int i = 0;
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return result;
    }
}
