

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
                inorder.add(curr.data);
                curr = curr.right;
            }
        } 
  return inorder;
        // Code
    }



}

