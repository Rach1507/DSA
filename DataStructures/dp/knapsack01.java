import java.util.Arrays;

public class knapsack01 {

    public static int knapsack0_1(int[] wt, int[] val, int W, int n) {

        // Hashtable <String , Integer> memo = new Hashtable<>();
        int[][] memo = new int[W + 1][n + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return knapsack0_1(wt, val, W, n, memo);
    }

    private static int knapsack0_1(int[] wt, int[] val, int W, int n, int[][] memo) {

        if (memo[W][n] != -1)
            return memo[W][n];

        if (W == 0 || n == 0)
            return 0;


        if (wt[n - 1] > W) // if wgt of last object is greater than capacity ,we cant include the object
            memo[W][n] = knapsack0_1(wt, val, W, n - 1, memo);

        else // max of profit of include the obj , exclude hte object
            memo[W][n] = Math.max((val[n - 1] + knapsack0_1(wt, val, W - wt[n - 1], n - 1, memo)),
                    knapsack0_1(wt, val, W, n - 1, memo));

        return memo[W][n];
    }

    public static void main(String[] args) {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapsack0_1(wt, val, W, n));
    }



















    // private static int knapsack0_1(int[] wt, int[] val, int W, int n,
    // Hashtable<String, Integer> memo) {

    // if(memo.containsKey(String.format("%d , %d", W, n))) return
    // memo.get(String.format("%d , %d", W, n));

    // if (W == 0 || n == 0)
    // return 0;

    // // if found in memo return it

    // if (wt[n - 1] > W) // if wgt of last object is greater than capacity ,we cant
    // include the object
    // memo.put(String.format("%d , %d", W, n ), knapsack0_1(wt, val, W, n - 1));

    // else // max of profit of include the obj , exclude hte object
    // memo.put(String.format("%d , %d", W, n ), Math.max((val[n - 1] +
    // knapsack0_1(wt, val, W - wt[n - 1], n - 1)), knapsack0_1(wt, val, W, n -
    // 1)));

    // return memo.get(String.format("%d , %d", W, n));
    // }

    // int max_val = Integer.MIN_VALUE;

    // for (int k = 1; k < val.length; k++) {

    // for (int j = 0; j < val.length; j++) {
    // int wgt = wt[j];
    // int profit = val[j];

    // for (int i = 0; i< k; i++) {
    // if (j!=i && wgt +wt[i] < W) {
    // wgt += wt[i];
    // profit += val[i];
    // }

    // if(wgt + wt[i] > W)
    // // // else
    // break;
    // }
    // max_val = Math.max(max_val, profit);
    // }

    // }

    // return max_val;
    // }

}
