import java.util.*;


public class bfs {




    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        Queue<Integer> que = new LinkedList<>();
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);

        que.add(0);
        vis[0] = true;
     

        while (!que.isEmpty()) {
            int p = que.poll();

       
            bfs.add(p);
           

            ArrayList<Integer> neighbours = adj.get(p);

            for (Integer next : neighbours) {
                if (!vis[next])
                    if (!que.contains(next)) {

                        que.add(next);
                        vis[next] = true;

                    }

            }

        }

        return bfs;

    }
}
