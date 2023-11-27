import java.util.ArrayList;

public class dfs {

    ArrayList<Integer> children;

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        // expec - print current , get children , ask each child to do depth first;
        // faith - children should do dfs on themselves

        // stopping point - no children return ;

        ArrayList<Integer> list = new ArrayList<>();

        dfs(0, adj, list);

        return list;

    }

    public void dfs(int curr, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {

        // System.out.print(curr + " ");
        list.add(curr);

        children = adj.get(curr);

        // System.out.println(children + " ");

        if (children.size() == 0)
            return;

        for (Integer node : children) {
            if (!list.contains(node))
                dfs(node, adj, list);
        }

        // Stack<Integer> stack = new Stack<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> nodes = new ArrayList<>();

        // stack.push(0);

        // while(!stack.isEmpty()){

        // int curr = stack.pop();
        // // if(!list.contains(curr))
        // list.add(curr);

        // nodes = adj.get(curr);

        // for(Integer node : nodes){
        // stack.push(node);
        // }

        // }

        // return list;
    }
}
