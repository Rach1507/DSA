public class smallestSubarr {
    public static long sb(long a[], long N, long x) {
        int n = (int) N;

        for (int i = 0; i < n; i++)
            if (a[i] > x)
                return 1;

        for (int i = 2; i < n - 1; i++) {
            int win_size = i;
            long win_sum = calculate_win_sum(a, win_size);

            int start = 0, end = i-1;
            while (end <= n) {
                if (win_sum > x){
                    System.out.println(win_size+" "+start +" " +end+" "+win_sum);
                    return win_size;

                }
                    
                else {
                    if (end == n) break;
                    win_sum += a[end++];
                    win_sum -= a[start++];

                }
            }

        }
        return n;
        // Your code goes here
    }

    public static long calculate_win_sum(long a[], int size) {
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(sb(new long[]{1, 4, 45, 6, 0, 19}, 6, 51));
        

         System.out.println(sb(new long[]{6, 3, 4, 5, 4, 3, 7 ,9}, 8,16));
    }
}
