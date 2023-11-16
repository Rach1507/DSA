import java.util.ArrayList;
import java.util.List;

public class inOrder {
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> traversal = new ArrayList<>();

        inorder(root, traversal);

        return traversal;

    }

    public void inorder(TreeNode node, ArrayList<Integer> traversal) {

        if (node == null)
            return;

        inorder(node.left, traversal);
        traversal.add(node.val);
        inorder(node.right, traversal);

    }
}
