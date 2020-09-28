package com.leetcode.dailyChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/evaluate-division/solution/dfs-de-ji-chu-ying-yong-by-returnnull-2/
 * https://leetcode-cn.com/problems/evaluate-division/solution/ni-zhen-de-zhi-dao-bing-cha-ji-de-gou-zao-guo-chen/
 */

public class CalcEquation {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> edgesToHashMap = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (!edgesToHashMap.containsKey(equations.get(i).get(j))) {
                    edgesToHashMap.put(equations.get(i).get(j), new HashMap<>());
                }
            }
            edgesToHashMap.get(equations.get(i).get(0)).put(equations.get(i).get(1), values[i]);
            edgesToHashMap.get(equations.get(i).get(1)).put(equations.get(i).get(0), 1.0 / values[i]);
        }

        double[] res = new double[queries.size()];
        HashSet<String> visited = new HashSet<>();
        for (int i = 0; i < res.length; ++i){
            visited.clear();
            double thisVal;
            String src = queries.get(i).get(0);
            String des = queries.get(i).get(1);
            if (edgesToHashMap.containsKey(src) && edgesToHashMap.containsKey(des)){
                thisVal = DFS(queries.get(i).get(0), queries.get(i).get(1), visited, edgesToHashMap);
            }
            else{
                thisVal = 0.0;
            }
            res[i] = thisVal == 0.0 ? -1 : thisVal;
        }
        return res;
    }

    private double DFS(String srcStr, String desStr, HashSet<String> visited, HashMap<String, HashMap<String, Double>> edgesToHashMap){
        if (visited.contains(srcStr)){
            return 0.0;
        }
        if (srcStr.equals(desStr)){
            return 1.0;
        }
        visited.add(srcStr);
        for (Map.Entry<String, Double> entry : edgesToHashMap.get(srcStr).entrySet()){
            String nextStr = entry.getKey();
            double edgeWeight = entry.getValue();
            double tmp = DFS(nextStr, desStr, visited, edgesToHashMap);
            if (tmp != 0.0){
                return tmp*edgeWeight;
            }
        }
        return 0;
    }
}
