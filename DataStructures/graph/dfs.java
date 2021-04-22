package graph;


import java.util.*;



public class dfs {

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {

    boolean[] vis = new boolean[v];
    ArrayList<Integer> ans = new ArrayList<Integer>();
    
    dfsearch(0,vis,adj,ans);
    
    return ans;
    
    
}

public void dfsearch(int v, boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
    
    
    
    
    vis[v]=true;
    ans.add(v);
    ArrayList<Integer> neighbour = adj.get(v);
    
    for(Integer node: neighbour)
        if (!vis[node])
            dfsearch(node,vis,adj,ans);
    
    

}

}
    

