import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;

    // Function to create a new binary tree node having a given key
    public TreeNode(int key) {
        data = key;
        left = right = null;
    }
}
public class postorder {
    private static void postorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }

            // Check for empty stack
            if (stack.empty())
                return;
            root = stack.pop();

            if (!stack.empty() && stack.peek() == root)
                root = root.right;

            else {

                System.out.print(root.data + " ");
                root = null;
            }
        }
    }
    
    public static void postorderIterate(TreeNode root) {
        // create an empty stack and push the root node
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        // create another stack to store postorder traversal
        Stack<Integer> out = new Stack();

        // loop till stack is empty
        while (!stack.empty()) {
            // pop a node from the stack and push the data into the output stack
            TreeNode curr = stack.pop();
            out.push(curr.data);

            // push the left and right child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        // print postorder traversal
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }

    public static void postordertrav(TreeNode root) {
        if(root == null)
        return ;


        // create an empty stack and push the root node
        Stack<TreeNode> stack = new Stack();
        
        TreeNode curr =root;
        // create another stack to store postorder traversal
        // Stack<Integer> out = new Stack();

        // loop till stack is empty
        while (!stack.empty() || curr !=null) {
            // pop a node from the stack and push the data into the output stack
       
            // out.push(curr.data);
if(curr != null)
            // push the left and right child of the popped node into the stack
            stack.push(curr);
        else
            break;
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
            //  curr = stack.pop();
            curr=curr.right;
            //  System.out.print(curr.data+ " ");
        }
        curr=root;
        while (!stack.empty() || curr != null) {

            // pop a node from the stack and push the data into the output stack

            // out.push(curr.data);

            // push the left and right child of the popped node into the stack
            if (curr != null)stack.push(curr);
            else break;

            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
            // curr = stack.pop();
            curr = curr.left;
            // System.out.print(curr.data+ " ");
        }

        // print postorder traversal
        while (!stack.empty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        /*
         * Construct the following tree 
         *  1 
         * /    \ 
         * 2    3
         * /    / \ 
         * 4    5 6 
         * / \ 
         *  7 8
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        postorderIterative(root);
        System.out.println();
        postordertrav(root);
    }
}
