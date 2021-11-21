package graph;

import java.util.*;

public class dfs {

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<Integer>();

        dfsearch(0, vis, adj, ans);

        return ans;

    }

    public void dfsearch(int v, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {

        vis[v] = true;
        ans.add(v);
        ArrayList<Integer> neighbour = adj.get(v);

        for (Integer node : neighbour)
            if (!vis[node])
                dfsearch(node, vis, adj, ans);

    }

    public void iterativeDFS(int source, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[adj.size()];

        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        // vis[v] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node);
            visited[node] = true;

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour])
                    stack.push(neighbour);
                    
            }
        }

    }

}
//