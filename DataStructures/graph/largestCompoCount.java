import java.util.*;

public class largestCompoCount {

        public int largestComponentCount(int v, ArrayList<ArrayList<Integer>> adj) {

            boolean[] vis = new boolean[v];
            Arrays.fill(vis, false);    
            // ArrayList<Integer> ans = new ArrayList<Integer>();
            vis[0] = true;
            int largestCompoCount = 0, cnt = 0;
            for (int i = 0; i < adj.size(); i++) {

                if (!vis[i]) {
                    cnt = dfsearch(i, vis, adj);
                    largestCompoCount = Math.max(largestCompoCount, cnt);
                }

               
            }

            return largestCompoCount;

        }

        public int dfsearch(int v, boolean vis[], ArrayList<ArrayList<Integer>> adj) {

            vis[v] = true;

            ArrayList<Integer> neighbour = adj.get(v);
            int count = 1;
            for (Integer node : neighbour)
                if (!vis[node]) {
                    count += dfsearch(node, vis, adj);
                }

            return count;
        }
}
