import java.util.ArrayList;
import java.util.HashMap;

public class edgeListToAdjList {
   public static void main(String[] args) {
        int[][] edge= new int[2][1];
        // {[[0,1],[1,2],[2,0]]};

        HashMap <Integer,ArrayList<Integer>> adj = new  HashMap<>();



        for(int i =0;i<edge.length;i++){
            int a= edge[i][0];
            int b= edge[i][1];
            if(!adj.containsKey(a)) 
            {
               ArrayList<Integer> neigh= new ArrayList<Integer>();
              
                adj.put(a,neigh);
            }
            if(!adj.containsKey(b)){
                ArrayList<Integer> neig = new ArrayList<Integer>();
             
                adj.put(b, neig);
            } 

            adj.get(b).add(a);
             adj.get(a).add(b);
        }

   } 


}