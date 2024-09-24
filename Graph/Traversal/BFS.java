package Graph.Traversal;
//2
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// consider example of social network
//immediate friend from starting point

// 1. when source is given
public class BFS {
    // // we use queue data structure
    // void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s) {//we given source
    // boolean visited[] = new boolean[v + 1];// to ensure no vertices vitied twice
    // Queue<Integer> q = new LinkedList<Integer>();
    // visited[s] = true;
    // q.add(s);
    // while (q.isEmpty() == false) {
    // int u = q.poll();
    // System.out.println(u + " ");
    // for (int t : adj.get(u)) {
    // if (visited[t] == false) {
    // visited[t] = true;
    // q.add(t);
    // }
    // }
    // }
    // }

    // 2. in source is not given
    // we use queue data structure
    // void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s,boolean [] visited)
    // {//we given source
    // Queue<Integer> q = new LinkedList<Integer>();
    // visited[s] = true;
    // q.add(s);
    // while (q.isEmpty() == false) {
    // int u = q.poll();
    // System.out.println(u + " ");
    // for (int t : adj.get(u)) {
    // if (visited[t] == false) {
    // visited[t] = true;
    // q.add(t);
    // }
    // }
    // }
    // }
    // //for source is not given O(v+E)
    // void Bfsdis(ArrayList<ArrayList<Integer>>adj,int v){
    // boolean visited[] =new boolean[v+1]; //we consider first node as source then
    // second
    // for(int i=0;i<v;i++){
    // if(visited[i]==false){
    // bfs(adj, i, visited);
    // }
    // }

    // }

    // 3. counting connected component or number of seperate graph or number of
    // iland
    void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s, boolean[] visited) {// we given source
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while (q.isEmpty() == false) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int t : adj.get(u)) {
                if (visited[t] == false) {
                    visited[t] = true;
                    q.add(t);
                }
            }
        }
    }

    // for source is not given O(v+E)
    int Bfsdis(ArrayList<ArrayList<Integer>> adj, int v) {
        int count = 0;
        boolean visited[] = new boolean[v + 1]; // we consider first node as source then second
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                bfs(adj, i, visited);
                count++;
            }
        }
        return count;

    }
}
// apllication of bfs
// 1. shortest printgraph
// 2.crawlers in search engine
// 3.peer to peer network
// 4.social network search
// 5.In garbage collection
// 6. cycle detection
// 7. ford-fulkerson algo(maximum flow algo)
// 8. Broadcasting
