class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
           this.left = left;
        this.right = right;
    }
}

class levelOrder{
    public static List <Integer> levelOrderTrav(TreeNode node) {
        Queue <TreeNode> queue = new LinkedList<>();
        List <Integer> levelOrder = new ArrayList<>();

        if(node == null) return levelOrder;

        queue.add(node);
        while(!queue.isEmpty())
        {

            node = queue.poll();
            if(node !=null)levelOrder.add(node.val);


            if(node.left !=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
            

            
        }
return levelOrder;

    }

    static ArrayList <Integer> levelOrder(Node node) 
    {
        Queue <Node> queue = new LinkedList<>();
        ArrayList <Integer> levelOrder = new ArrayList<>();

        if(node == null) return levelOrder;

        queue.add(node);
        while(!queue.isEmpty())
        {

            node = queue.poll();
            if(node !=null)levelOrder.add(node.data);


            if(node.left !=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
            

            // TreeNode curr
        }s
return levelOrder;
    }
}