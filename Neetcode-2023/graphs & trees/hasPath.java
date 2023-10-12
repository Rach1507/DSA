package Neetcode-2023.graphs & trees;

public class hasPath {

  public static boolean hasPat(Map<String, List<String>> graph, String src, String dst) {
    
    if(src.equals(dst))return true;
    Stack<String> stack = new Stack<>();

    List<String> children = graph.get(src);
    
    if(children.size()>0){
      for(String child :children ){
      stack.push(child);
    }
    }

    String curr = "";

    while(!stack.isEmpty()){
      
      curr = stack.pop();
      
      if(curr.equals(dst)){
        return true;
      }else{
        children = graph.get(curr);
        if(children.size()>0){
          for(String child :children ){
          stack.push(child);
          }
        }else{
          continue;
        }
      }
    }
    
    
    return false;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}}
