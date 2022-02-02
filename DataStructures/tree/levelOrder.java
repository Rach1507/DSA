
import java.util.*;

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

public class levelOrder {

    static ArrayList<Integer> levelOrderNormal(TreeNode node) {
        java.util.Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> levelOrder = new ArrayList<>();

        if (node == null)
            return levelOrder;

        queue.add(node);
        while (!queue.isEmpty()) {

            node = queue.poll();
            if (node != null)
                levelOrder.add(node.val);

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            // TreeNode curr
        }
        return levelOrder;
    }

    static List<List<Integer>> levelOrder = new ArrayList();
    static Map<Integer, List<Integer>> map = new HashMap();

    public static List<List<Integer>> levelOrderTrav(TreeNode root) {

        if (root == null)
            return levelOrder;
        dfs(root, 0);

        map.forEach((k, v) -> levelOrder.add(k, v));







        // java.util.Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();

        // HashMap<TreeNode, Integer> levels = new HashMap<>();

        // if (node == null)
        // return levelOrder;

        // queue.add(node);

        // levels.put(node, 0);

        // levelOrder.add(new ArrayList<>());

        // while (!queue.isEmpty()) {

        // node = queue.poll();
        // int level = levels.get(node);

        // if (node != null) {

        // System.out.println("Level is: " +level +" Nodes: "+node.val);
        // levelOrder.get(level).add(node.val);;
        // // System.out.println(order);
        // // order

        // // levelOrder.add(level, order);
        // System.out.println(levelOrder);

        // }
        // try {
        // if (node.left != null || node.right != null)
        // levelOrder.set(level + 1, new ArrayList<>());
        // } catch (Exception e) {
        // levelOrder.add(level + 1, new ArrayList<>());
        // }

        // if (node.left != null) {

        // levels.put(node.left, (level + 1));
        // queue.add(node.left);

        // }
        // if (node.right != null) {
        // queue.add(node.right);
        // levels.put(node.right, (level + 1));
        // }

        // }
        // for (int i = 0; i < levelOrder.size(); i++) {

        // if (levelOrder.get(i).isEmpty())
        // levelOrder.remove(i);
        // }

        return levelOrder;
    }

    private static void dfs(TreeNode node, int level) {
        if (node == null)
            return;
        if (!map.containsKey(level))
            map.put(level, new ArrayList());
        map.get(level).add(node.val);
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    public static void main(String[] args) {
        /*
         * Construct the following tree
         * 1
         * / \
         * 2 3
         * / / \
         * 4 5 6
         * / \
         * 7 8
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        List<List<Integer>> order = levelOrderTrav(root);

        for (List<Integer> list : order) {
            System.out.println(list);
        }
    }

}
