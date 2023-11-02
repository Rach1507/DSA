package Neetcode-2023.Recursion;

public class printN {
    
        static void printTillN(int N){
         
            int i = 1;
            printNum(i,N);
           
        }
        
        static void printNum(int i , int N){
            if (i > N ) return;
            
            System.out.print(i+ " ");
            
            printNum(i+1,N);
        }
    
}
