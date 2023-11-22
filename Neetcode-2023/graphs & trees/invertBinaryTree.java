public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
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
