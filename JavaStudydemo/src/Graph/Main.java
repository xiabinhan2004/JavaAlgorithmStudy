package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.List;

class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    public void addEdge(String src, String dest) {
        this.adjList.putIfAbsent(src, new ArrayList<>());
        this.adjList.get(src).add(dest);
    }

    public List<String> BFS(String start) {
        List<String> visited = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (String v : this.adjList.get(vertex)) {
                    queue.add(v);
                }
            }
        }
        return visited;
    }

    public List<String> DFS(String start) {
        List<String> visited = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                List<String> neighbors = this.adjList.get(vertex);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    stack.push(neighbors.get(i));
                }
            }
        }
        return visited;
    }

    
}
public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String graphType = scanner.nextLine();
        String[] vertexAndEdgeCount = scanner.nextLine().split(" ");
        int vertexCount = Integer.parseInt(vertexAndEdgeCount[0]);
        int edgeCount = Integer.parseInt(vertexAndEdgeCount[1]);
        // scanner.nextLine();  
    
        Graph graph = new Graph();
        String[] vertices = scanner.nextLine().split(" ");
        for (int i = 0; i < edgeCount; i++) {
            String[] edgeVertices = scanner.nextLine().split(" ");
            String src = edgeVertices[0];
            String dest = edgeVertices[1];
            graph.addEdge(src, dest);
            if (graphType.equals("UDG")) {
                graph.addEdge(dest, src);
            }
        }
    
        List<String> bfsResult = graph.BFS(vertices[0]);
        List<String> dfsResult = graph.DFS(vertices[0]);
    
        StringJoiner bfsJoiner = new StringJoiner(" ");
        for (String s : bfsResult) {
            bfsJoiner.add(s);
        }
    
        StringJoiner dfsJoiner = new StringJoiner(" ");
        for (String s : dfsResult) {
            dfsJoiner.add(s);
        }
    
        System.out.println(bfsJoiner.toString());
        System.out.println(dfsJoiner.toString());
    }
}