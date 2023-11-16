import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public List<List<Integer>> levelOrderTraversal(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return res;

        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            res.add(level);
        }
        return res;

        // List<List<Integer>> order = new ArrayList<>();

        // if(root != null){
        // HashMap<TreeNode,Integer> levels = new HashMap<>();
        // Queue<TreeNode> queue = new LinkedList<>();

        // queue.add(root);
        // levels.put(root,0);

        // ArrayList <Integer> level = new ArrayList<>();
        // level.add(root.val);
        // order.add(0, level);

        // while(!queue.isEmpty()){

        // TreeNode node = queue.poll();
        // int rootLevel = levels.get(node);

        // if(node.left !=null ){
        // queue.add(node.left);
        // levels.put(node.left, rootLevel +1 );
        // if(order.size() <= rootLevel+1 ) {
        // order.add(rootLevel + 1 , new ArrayList<>());
        // }
        // order.get(rootLevel +1).add(node.left.val);
        // }
        // if(node.right !=null ){
        // queue.add(node.right);
        // levels.put(node.right, rootLevel +1 );
        // if(order.size() <= rootLevel+1 )
        // order.add(rootLevel + 1 , new ArrayList<>());
        // order.get(rootLevel +1).add(node.right.val);
        // }

        // }
        // }
        // return order;

    }
}
