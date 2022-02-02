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
    
   class Solution {
       public List<Integer> preorderTraversal(TreeNode node) {
           
           Stack<TreeNode> stack = new Stack<>();
           List<Integer> order = new ArrayList<>();
           
           if(node == null) return order;
           
           stack.push(node);
           
           while(!stack.isEmpty()){
   
               node = stack.pop();
               order.add(node.val);
               
               if(node.right != null){
               stack.push(node.right);
                
               }
                 
               if(node.left != null){
               stack.push(node.left);
                   
               }
              
   
           }
           return order;
           }



           public List<Integer> preorderOptimal(TreeNode node) {
        
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> order = new ArrayList<>();
            
            if(node == null) return order;
            
            stack.push(node);
            TreeNode curr = node;
            
            while(!stack.isEmpty()){
    
              
            
                
                if(curr != null){
                        order.add(curr.val);
                    if(curr.right!= null)
                        stack.push(curr.right);
                    curr= curr.left;
                 
                }
              
               else{
                     curr = stack.pop();
               }
    
            }
            return order;
            }
    
   }
   