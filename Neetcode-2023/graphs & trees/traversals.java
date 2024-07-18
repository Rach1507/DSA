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

public class traversals {
    
    ArrayList<Integer> inOrder(Node root) {
        
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        
        Node curr = root ; 
       
        while(true){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            } else {
                if(stack.isEmpty()) break;
                
                curr = stack.pop();
                inorder.add((Integer) curr.data);
                curr = curr.right;
            }
        } 
  return inorder;
        // Code
    }



}

