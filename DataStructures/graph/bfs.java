import java.util.*;


public class bfs {




    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        Queue<Integer> que = new LinkedList<>();
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);


        // add the source to queue
        

        // loop
            //poll
            //print it 
            //mark as visited
            
            // consider neighbours add them all to queue if not visited
            
        


        que.add(0);
       
     

        while (!que.isEmpty()) {
            int p = que.poll();
            bfs.add(p);
            vis[p]=true;
           

            ArrayList<Integer> neighbours = adj.get(p);

            for (Integer next : neighbours) {
                if (!vis[next])
                   {

                        que.add(next);
                       
                    }

            }

        }

        return bfs;

    }
}
