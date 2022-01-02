import java.util.*;

public class gridTravellor {

    // public int uniquePaths(int m, int n) {

    // int[][] memo = new int[m + 1][n + 1];

    // for (int i = 0; i < m + 1; i++)
    // Arrays.fill(memo[i], 0);

    // return findPath(m, n, memo);
    // }

    // public int findPath(int m, int n, int[][] memo) {

    // if (m == 0 || n == 0)
    // return 0;

    // if (m == 1 && n == 1)
    // return 1;

    // if (memo[m][n] == 0)

    // memo[m][n] = findPath(m - 1, n, memo) + findPath(m, n - 1, memo);

    // return memo[m][n];
    // }



    public static int gridTravTabulation(int m, int n) {

        int[][] table = new int[m + 1][n + 1];

        for (int[] is : table) {
            Arrays.fill(is, 0);

        }

        table[1][1] = 1;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int cur = table[i][j];
                if (i + 1 < m)
                    table[i + 1][j] += cur;

                if (j + 1 < n)
                    table[i][j + 1] += cur;

            }
        return table[m][n];
    }

    public int uniquePaths(int m, int n) {

        HashMap<String, Integer> memo = new HashMap<>();

        return findPath(m, n, memo);
    }

    public int findPath(int m, int n, HashMap<String, Integer> memo) {

        // String key = m + "," + n;
        String key = String.valueOf(m + "," + n);

        if (memo.containsKey(key))
            return memo.get(key);

        if (m == 0 || n == 0)
            return 0;

        if (m == 1 && n == 1)
            return 1;

        // if (!memo.containsKey(key))

        memo.put(key, findPath(m - 1, n, memo) + findPath(m, n - 1, memo));

        return memo.get(key);
    }

    public int uniquePathsOptimal(int m, int n) {

        // m+n-2
        // C
        // m-1

        // its a combinatrix problem

        int N = m + n - 2;

        int r = m - 1;

        double c = 1;

        for (int i = 1; i <= r; i++) {
            c = c * (N - r + i) / i;
        }

        return (int) c;

    }
}
