package com.icortex.ds.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Method to create the graph
    static void createGraph(List<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // Method for Breadth-First Search (BFS)
    public static void bfs(List<Edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    if (!visited[edge.dest]) {
                        q.add(edge.dest);
                    }
                }
            }
        }
    }

    // Method for Depth-First Search (DFS)
    public static void dfs(List<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!vis[edge.dest]) {
                dfs(graph, edge.dest, vis);
            }
        }
    }

    public static void findAllPath(List<Edge> graph[], boolean visited[], int curr, String path, int desti) {
        if (curr == desti) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!visited[edge.dest]) {
                visited[curr] = true;
                findAllPath(graph, visited, edge.dest, path + edge.dest, desti);
                visited[curr] = false;
            }
        }
    }

    public static int countAllPaths(List<Edge> graph[], boolean visited[], int curr, int desti) {
        if (curr == desti) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!visited[edge.dest]) {
                visited[curr] = true;
                count += countAllPaths(graph, visited, edge.dest, desti);
                visited[curr] = false;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int v = 7;

        List<Edge> edges[] = new ArrayList[v];
        createGraph(edges);
//
//        System.out.println("Traverse Graph BFS: ");
//        bfs(edges, v);
//        System.out.println();
//
//        boolean visited[] = new boolean[v];
//        System.out.println("Traverse Graph DFS: ");
//        dfs(edges, 0, visited);
//        System.out.println();
//
//        System.out.println("Traverse Graph DFS If graph is not connected: ");
//
//        boolean visited1[] = new boolean[v];
//        for (int i = 0; i < v; i++) {
//            if (!visited1[i]) {
//                dfs(edges, i, visited1);
//            }
//        }
        System.out.println();

        System.out.println("Traverse all the path from source to desi");
        findAllPath(edges,new boolean[v],0,"0",5);
        System.out.println("count all path");
        System.out.println(countAllPaths(edges, new boolean[v], 0, 5));
    }
}
