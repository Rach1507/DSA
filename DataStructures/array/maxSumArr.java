public class maxSumArr {

    public int bruteForce(int[] arr) {
        return 0;

    }

    public int Kadanes(int[] arr) {
        int best_sum = 0;
        int cur_sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            cur_sum = Math.max(0, cur_sum + arr[i]);
            if (best_sum < cur_sum)
                best_sum = cur_sum;
                // can also use 
                // best_sum = Math.max(best_sum, cur_sum);
        }

        return best_sum;

    }

}
