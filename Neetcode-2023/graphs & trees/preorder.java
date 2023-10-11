package Neetcode-2023.trees;

public class preorder {
    
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> preorderList = new ArrayList<>();
        recursivePreOrder(root , preorderList);
        
        return preorderList;
        
    }

    static void recursivePreOrder ( Node node ,ArrayList<Integer> preorderList ){
        if(node==null)return;
        preorderList.add(node.data);
         recursivePreOrder(node.left , preorderList);
          recursivePreOrder(node.right , preorderList);
    }
}
