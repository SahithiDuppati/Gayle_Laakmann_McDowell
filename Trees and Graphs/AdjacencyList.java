package GayleLaakmann;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args){
        int v = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(v);

        for(int i = 0;i < v;i++) {
            graph.add(new ArrayList<>());
        }

            addEdge(graph, 0, 1);
            addEdge(graph, 0, 4);
            addEdge(graph, 1, 2);
            addEdge(graph, 1, 3);
            addEdge(graph, 1, 4);
            addEdge(graph, 2, 3);
            addEdge(graph, 3, 4);
            printGraph(graph);

    }
    public static void addEdge(ArrayList<ArrayList<Integer>> graph,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void printGraph(ArrayList<ArrayList<Integer>> graph){
        for(int i = 0; i < graph.size();i++){
            System.out.println("Adjacency List of vertex" + i);
            System.out.print(i);
            for(int j = 0;j < graph.get(i).size();j++){
                System.out.print("->"+graph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
