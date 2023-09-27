package Neetcode-2023.Recursion;

public class fact {
    static long factorial(int n){
        // code here
        
        
        // exp - f(4) = 4 * 3* 2* 1
        
        // assum - f(3) =  3 * 2 * 1
        
        // connection = f(4) =  4 * f(3)
        
        // generalise f(n) =  n * f(n-1)
        
        //edge or end case - 1 
        
        
        if(n == 1 || n == 0 ) return 1;
       
        return n * factorial(n-1);
        
        
    }
    
}
