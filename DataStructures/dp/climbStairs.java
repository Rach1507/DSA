import java.util.*;

public class climbStairs {
    public int climbStairs(int n) {

        int memo[] = new int[n + 1];
        Arrays.fill(memo, 0);

        return waysToClimbN(n, memo);

    }

    public int waysToClimbN(int n, int[] memo) {

        if (n == 0)
            return 1;

        if (n < 0)
            return 0;

        if (memo[n] == 0)
            memo[n] = waysToClimbN(n - 1, memo) + waysToClimbN(n - 2, memo);

        return memo[n];
    }
}
