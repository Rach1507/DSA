/* 

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3



Approach:

given a tree :

check if its null

  
get the height of left subtree                                                  
get the height of right subtree 


          3                       1
         
    /.           \                 +
   /              \
leftsubtree     rightSubTree.     maxheight


Max height is ( max of hgt of left and right subtree) + itself

 return Math.max(leftSubTree,rightSubTree)+1;


*/




public class max_depth {
    static int hgt, max_height;

    public static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;



            int leftSubTree = maxDepth(root.left);
            int rightSubTree = maxDepth(root.right);

            return Math.max(leftSubTree,rightSubTree)+1;

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

        System.out.println(maxDepth(root));
    }
}
