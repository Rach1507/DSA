import java.util.*;



//internal node class 
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

public class preorder {
    
    static ArrayList<Integer> preorderTrav(Node root)
    {
        ArrayList<Integer> preorderList = new ArrayList<>();
        recursivePreOrder(root , preorderList);
        
        return preorderList;
        
    }

    static void recursivePreOrder ( Node node ,ArrayList<Integer> preorderList ){
        if(node==null)return;
        preorderList.add((Integer) node.data);
         recursivePreOrder(node.left , preorderList);
          recursivePreOrder(node.right , preorderList);
    }
}
