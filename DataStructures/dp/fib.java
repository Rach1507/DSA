import java.util.Arrays;

public class fib {

    static int memo[] = new int[31];

    public int fibo(int n) {

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

    public int fibTabulation(int n) {

        int table[] = new int[n + 1];

        Arrays.fill(table, 0);

        table[1] = 1;

        for (int i = 0; i < table.length; i++) {
            table[i + 1] += table[i];
            table[i + 2] += table[i];
        }

        return table[n];

    }

    public int fib(int n) {

        if (n < 2)
            return n;
        if (memo[n] == 0)
            memo[n] = fib(n - 1) + fib(n - 2);

        return memo[n];

    }

}
