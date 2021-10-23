public class fib {
    


    public int fibo(int n) {
        
        
        if(n<2) return n;
        
        int a =0, b= 1,c=0;
        
        while(n>1){
           c = a+b;
            a=b;
            b=c;
            
            n--;
        }
        
        return c;
        
        
    }

// static int memo[]=new int[31];
// public int fib(int n) {

// if(n<2) return n;
// if(memo[n]==0)
// memo[n]=fib(n-1)+fib(n-2);

// return memo[n];

// }
}