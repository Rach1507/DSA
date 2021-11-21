import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class dfsearch {
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

    public dfsearch(int n) {
        boolean isVisited[] = new boolean[n];
        Arrays.fill(isVisited, false);
        int curNode = 0;
        dfsearc(curNode, isVisited);
        dfsear(curNode, isVisited);
    }

    public void dfsearc(int curNode, boolean isVisited[]) {
        if (!isVisited[curNode]) {
            isVisited[curNode] = true;
            ArrayList<Integer> alist = adjList.get(curNode);

            for (int i = 0; i < alist.size(); i++)
                if (!isVisited[i])
                    dfsearc(i, isVisited);

        }

    }

    public void dfsear(int curNode, boolean isVisited[]) {

        Stack<Integer> stack = new Stack<>();

        stack.push(curNode);

        while(!stack.isEmpty()){
            int curr = stack.pop();
            System.out.println(curr);
            isVisited[curr]=true;

            for(int neighbour: adjList.get(curr)){

                if(!isVisited[neighbour])
                stack.push(neighbour);



            }

        }


    }

    public static void main(String[] args) {
        dfsearch d = new dfsearch(5);
    }
}