import java.util.ArrayList;
import java.util.Iterator;

public class dfs{
      static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
 public dfs(int n){
    boolean isVisited[]= new boolean[n];
    int curNode=0;
    dfsearch(curNode,isVisited);
 }
 
    public void dfsearch(int curNode,boolean isVisited[]){
        if (!isVisited[curNode]){
            isVisited[curNode]= true;
            ArrayList<Integer> alist = adjList.get(curNode);

            
            for (int i =0;i<alist.size();i++)
                if (!isVisited[i]) 
                    dfsearch(i, isVisited);
                
            }

        }
        
    
    public static void main(String[] args) {
        dfs d = new dfs(5);
    }
}