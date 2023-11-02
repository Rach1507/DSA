package Neetcode-2023.Recursion;

public class print1toN {

    
        // e - f(5) = 5 4 3 2 1
        // f - f(4) =  4 3 2 1
        // connection = 5 f(4)
        
        // generalise
        
        //e - f(n) = n n-1 n-2 n-3 n-4 ...1
        //f - f(n-1) = n-1 n-2 n-3 n-4 ...1
        //connection - f(n) = n f(n-1)
    
        void printNos(int N) {
            if(N < 1) return;
            System.out.print(N + " ");
            printNos(N-1);
        }
    
}
