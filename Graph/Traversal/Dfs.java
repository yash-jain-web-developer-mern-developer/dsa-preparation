package Graph.Traversal;
//3
import java.util.ArrayList;

// up to down left to right
//like pre order traversal
public class Dfs {
    // 1. we have source vertices
    // recurcively call for adjacent
    // lowest number vertex
    void Dfsrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
        visited[s]=true;
        System.out.println(s+"");
        for(int u:adj.get(s)){
            if(visited[u]==false){
                Dfsrec(adj, s, visited);
            }
        }
    }

    void DFS(ArrayList<ArrayList<Integer>>,int v,int s){
      boolean visited[]=new boolean[v];
       Dfsrec(adj, s, visited);
        }
  2. for disconnected graph
}
// Application
// 1.Cycle detection
// 2. Topological sorting
// 3.Strongly connected component
// 4.solving maze and similar puzzle
// 5. path finding