package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class ProcessQueries {

    public int[] processQueries(int[] queries, int m) {
        int[] p = new int[m];
        int n = queries.length;
        int[] result = new int[n];
        for (int i = 0; i < m; i++) p[i] = i + 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (queries[i] == p[j]) {
                    result[i] = j;
                    while (j != 0) {
                        p[j] = p[j - 1];
                        j--;
                    }
                    p[0] = queries[i];
                    break;
                }
            }
        }
        return result;
    }

    public int[] processQueriesOtherWay(int[] queries, int m) {
        int[] p = new int[m + 1];
        for (int i = 1; i <= m; i++) p[i] = i;
        for (int i = 0; i < queries.length; i++) {
            int value = queries[i];
            queries[i] = p[value] - 1;
            //value代表query的数字，p[value]代表query在p中的位置
            for (int j = 1; j <= m; j++) if (p[j] < p[value]) p[j]++;
            p[value] = 1;
        }
        return queries;
    }

    public int[] processQueriesInOtherWay(int[] queries, int m) {
        List list = new ArrayList<>();
        for (int i = 1; i <= m; i++) list.add(i);
        for (int i = 0; i < queries.length; i++) {
            queries[i] = list.indexOf(queries[i]);
            int rel = (int) list.remove(queries[i]);
            list.add(0, rel);
        }
        return queries;
    }
}
