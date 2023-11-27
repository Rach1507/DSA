import java.util.*;


public class postorder {
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> postorderList = new ArrayList<>();
        recursivePostOrder(root , postorderList);
        
        return postorderList;
        
    }

    static void recursivePostOrder ( Node node ,ArrayList<Integer> postorderList ){
        if(node==null)return;

        recursivePostOrder(node.left , postorderList);
        recursivePostOrder(node.right , postorderList);
        postorderList.add(node.data);
    }
}
