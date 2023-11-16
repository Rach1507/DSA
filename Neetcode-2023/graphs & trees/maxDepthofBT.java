import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class maxDepthofBT {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);

    }

    public int maxDepthIterative(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return 0;

        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            level++;
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return level;

    }
}
