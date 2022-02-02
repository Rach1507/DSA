class Node
{
    int data;
    Node left, right;
 
    // Function to create a new binary tree node having a given key
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}
public class inorder{
    public static void inorderTrav(Node node){
        
        Stack<Node> stack = new Stack<>();

        while(!stack.isEmpty() || node != null){

            if(node != null){
            stack.push(node);
            node =node.left; 
            }

            else{
                node = stack.pop();

                System.out.println(node.data);

                node = node.right;
            }

        }
    }

    public static void main(String[] args) {
        
    }
}