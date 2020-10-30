package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CloneGraph {

    Map<Node, Node> visited = new HashMap<>();

    // dfs
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (visited.containsKey(node)) return visited.get(node);
        Node cloneNode = new Node(node.val, new ArrayList<>());
        visited.put(node, cloneNode);
        for (Node neighbor : node.neighbors) cloneNode.neighbors.add(cloneGraph(neighbor));
        return cloneNode;
    }

    public Node cloneGraphOtherWay(Node node) {
        if (node == null) return null;
        HashMap<Node, Node> visited = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.put(node, new Node(node.val, new ArrayList<>()));

        while (!queue.isEmpty()) {
            Node n = queue.remove();
            for (Node neighbor : n.neighbors) {
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                visited.get(n).neighbors.add(visited.get(neighbor));
            }
        }
        return visited.get(node);
    }
}
