package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolders {

    public List<String> removeSubFolders(String[] folder) {
        List<String> result = new ArrayList<>();
        Arrays.sort(folder);
        result.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String fatherFolder = result.get(result.size() - 1);
            // 建立在folder不会重复的基础上,如果folder重复需要用TreeSet
            if (!folder[i].contains(fatherFolder + "/")) {
                result.add(folder[i]);
            }
        }
        return result;
    }
}
