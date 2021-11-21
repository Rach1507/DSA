import java.util.ArrayList;

public class buildGraph {
    
    public static ArrayList<ArrayList<Integer>>  buildGraphFrom2DArray(int [][] Graph2DArr){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // itetatee throught the list

        for(int[] i : Graph2DArr){
            int a = i[0];
            int b = i[1];


            // if (!adj.containsKey(a)) {
            //     ArrayList<Integer> neigh = new ArrayList<Integer>();

            //     adj.put(a, neigh);
            // }
            // if (!adj.containsKey(b)) {
            //     ArrayList<Integer> neig = new ArrayList<Integer>();

            //     adj.put(b, neig);
            // }

            // adj.get(b).add(a);
            // adj.get(a).add(b);

            

        }

        return adj;
    }




}
