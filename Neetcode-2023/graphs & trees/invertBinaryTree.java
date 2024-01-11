public class invertBinaryTree {

    public TreeNode invertTree(TreeNode node) {
        if (node == null)
            return node;

        if (node.left == null && node.right == null)
            return node;

        if (node.left != null)
            invertTree(node.left);

        if (node.right != null)
            invertTree(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;

    }

    public TreeNode invertTreeTwoFuncs(TreeNode root) {
        if (root != null)
            invert(root);
        return root;
    }

    public void invert(TreeNode node) {
        if (node.left == null && node.right == null)
            return;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null)
            invert(node.left);

        if (node.right != null)
            invert(node.right);

    }
}
