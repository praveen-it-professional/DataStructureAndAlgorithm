import java.util.*;

public class Graph {
    int vertex[];
    static Map<Integer, LinkedList<Integer>> map;
    
    public Graph(int vtx){
        this.vertex=new int[vtx];
        map=new HashMap<Integer, LinkedList<Integer>>();
        for(int i=0;i<vtx;i++){
            vertex[i]=0;
            map.put(i,new LinkedList<Integer>());
        }
    }

    public void addEdge(int vtx, int val){
        this.map.get(vtx).add(val);
    }

    private boolean checkConnected(int vertex) {

        
        for(int i=0;i<vertex;i++){
            boolean visitedB[]=new boolean[vertex];
            DFS(i,visitedB);
            for(boolean b:visitedB){
                if(!b){
                    return false;
                }
            }
        }
        return true;
    }
    
    private static void DFS(int i, boolean[] visitedB) {

        visitedB[i]=true;
        for(int val:map.get(i)){
            if(!visitedB[val]){
                DFS(val,visitedB);
            }
        }
    }

    public static void main(String[] args) {
        Graph gp=new Graph(4);
        gp.addEdge(0,1);
        
        gp.addEdge(1,0);
        gp.addEdge(1,3);

        gp.addEdge(2,0);

        gp.addEdge(3,0);
        gp.addEdge(3,2);

        /*
        You are given a directed graph as input. The task is to check if the given graph is connected or not.
        */
        boolean checkIfConnected= gp.checkConnected(4);
        if(checkIfConnected){
            System.out.println("Graph is completelly connected!!!");
        }else{
            System.out.println("Graph is Not completelly connected!!!");
        }
    }
}
