import java.util.Arrays;

public class fib {

    static int memo[] = new int[31];

    public static int fibTabulation(int n) {

        int table[] = new int[n + 2];

        Arrays.fill(table, 0);

        table[1] = 1;

        for (int i = 0; i < n; i++) {

            // pick the first one 
            int ele = table[i];

            // add them to next two numbers 
            table[i + 1] += ele;
            table[i + 2] += ele;
        }
        
        return table[n];

    
    }

    public static int fiboTabOptimization(int n) {

        if (n < 2)
            return n;

        int a = 0, b = 1, c = 0;

        while (n > 1) {
            c = a + b;
            a = b;
            b = c;

            n--;
        }

        return c;

    }

  




    public  static int fib(int n) {

        memo[0] = 0;
        memo[1] = 1;


        if (memo[n] == 0 && n >=2)
            memo[n] = memo[n - 1] + memo[n - 2];
             return memo[n];

    }






    
    public static int fib2(int n) {

      if (n<=1) return n;

        if (memo[n] == 0)
            memo[n] = fib2(n - 1) + fib2(n - 2);

        return memo[n];

    }


    public static void main(String[] args) {
        System.out.println(fib2(8));
        System.out.println(fib(8));

        System.out.println(fibTabulation(8));

        System.out.println(fiboTabOptimization(8));

        System.out.println();

    }

}
