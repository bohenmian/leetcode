package com.nowcoder.array;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(i < j) {
            if(array[i] + array[j] == sum) {
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                break;
            }
            while(i < j && array[i] + array[j] > sum)
                j--;
            while(i < j && array[i] + array[j] < sum)
                i++;
        }
        return arrayList;
    }
}
