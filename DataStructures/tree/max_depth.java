public class max_depth {
    static int hgt, max_height;

    public static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;



            int leftTree = maxDepth(root.left);
            int rightTree = maxDepth(root.right);

            return Math.max(leftTree,rightTree)+1;

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
