import java.util.*;

// x == '(' || x == '[' || x == '{'
  
public class BalancedBraces  
{ 
    //TODO:use tokens


    static Character matchingBrace(Character ch){

        if(ch=='(') return ')';
        if(ch=='[') return ']';
        else return '}';
    }
   
    static boolean isBalanced(String expr) 
    { 
        ArrayList <Character> OpenBraces=new ArrayList<>();

    
        OpenBraces.add('[');
        OpenBraces.add('{');
        OpenBraces.add('(');

        Stack<Character> stack = new Stack<Character>(); 
  
     
        for (int i = 0; i < expr.length(); i++)  
        { 
            char x = expr.charAt(i); 
  
            if (OpenBraces.contains(x))  
            { 
              
                stack.push(x); 
                continue;
            }

            else if (stack.isEmpty())  return false; 


            // char check; 
            Character topBrace= stack.peek();
            Character closeBrace =matchingBrace(topBrace);

            if (x==closeBrace) stack.pop();


        } 
  
        return (stack.isEmpty()); 
    


    }

    public static void main(String[] args) 
    { 
        String expr = "([{)()}][)"; 
    
        if (isBalanced(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
    } 
}
    

// char [] bracks ={'[','{','('};

            // switch (x) 
            // { 
            // case ')': 
            //     check = stack.pop(); 
            //     if (check == '{' || check == '[') 
            //         return false; 
            //     break; 
  
            // case '}': 
            //     check = stack.pop(); 
            //     if (check == '(' || check == '[') 
            //         return false; 
            //     break; 
  
            // case ']': 
            //     check = stack.pop(); 
            //     if (check == '(' || check == '{') 
            //         return false; 
            //     break; 
            // } 
    // static boolean isBalanced(String expr) 
    // { 

    // }









    
    // System.out.println(Arrays.toString(array)); 