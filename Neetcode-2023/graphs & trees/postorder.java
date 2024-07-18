import java.util.*;



class Node<T> {
    T data;
    public Node left;
    public Node right;
   

    private Node (T data , Node <T> prev ,Node <T> next){
        this.data=data;
        this.left=left;
        this.right=right;
    }



}

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
        postorderList.add((Integer) node.data);

    }
}
