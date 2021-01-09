package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }

    private void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[cur]);
        dfs(cur + 1, nums);
        list.remove(list.size() - 1);
        dfs(cur + 1, nums);
    }


    public List<List<Integer>> subsetsOtherWay(int[] nums) {
        int count = 1 << nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1)
                    arrayList.add(nums[i]);

            }
            result.add(arrayList);
        }
        return result;
    }

}
