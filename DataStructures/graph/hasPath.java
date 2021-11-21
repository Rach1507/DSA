import java.util.*;


public class hasPath {
    public boolean validPath(int n, int[][] edges, int start, int end) {

        Queue<Integer> que = new LinkedList<>();
        boolean vis[] = new boolean[n];
        Arrays.fill(vis, false);

        que.add(start);
        vis[start] = true;

        while (!que.isEmpty()) {
            int p = que.poll();

            vis[p] = true;
            if (p == end)
                return true;

            ArrayList<Integer> neighbour = new ArrayList<>();

            for (int i = 0; i < edges.length; i++)

            {
                if (edges[i][0] == p)
                    neighbour.add(edges[i][1]);
                if (edges[i][1] == p)
                    neighbour.add(edges[i][0]);
            }

            for (Integer next : neighbour) {
                if (!vis[next]) {

                    que.add(next);
                    // vis[next] = true;

                }

            }

        }
        return false;
    }
    
}
