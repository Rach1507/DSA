public class climbStairs {
    public int climbStair(int n) {

        int memo[] = new int[n + 1];
        Arrays.fill(memo, 0);

        return ways(n, memo);
    }

    public int ways(int n, int[] memo) {

        if (n == 2 || n == 1)
            return n;
        if (memo[n] != 0)
            return memo[n];

        memo[n] = ways(n - 1, memo) + ways(n - 2, memo);
        return memo[n];
    }
}
