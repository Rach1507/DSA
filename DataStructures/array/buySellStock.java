import java.util.Arrays;

public class buySellStock {
    public static void main(String[] args) {
        // int[] arr= {1,3,2,6};
        int[] arr = { 2, 4, 1, 3, 5 };
        // System.out.println(sortAndcount(arr,0,5));
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1,0));
    }

    // public int maxProfit(int[] prices, int min) {

    //     int min = findMin(prices, min, 0);
    //     int max = findMax(prices, min);
    //     int profit = prices[max] - prices[min];

    //     if (profit == 0)

    //         maxProfit(prices, sec_min);

    // }

    // public int findMin(int[] prices, int min, int sec_min) {

    //     int n = prices.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         if (i == min)
    //             continue;
    //         if (prices[i] < prices[min]) {
    //             sec_min = min;
    //             min = i;
    //         }
    //     }

    // }

    // public int findMax(int[] prices, int min) {

    //     max = min;
    //     for (int i = min + 1; i < prices.length; i++) {
    //         if (prices[i] > prices[max] && prices[i] > prices[min])
    //             max = i;
    //     }

    //     return max;

    // }


    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        int profit =0;
        int max_pro=0;
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                {
                    profit = right[j] - left[i];
                    if (profit > max_pro)
                        max_pro = profit;

                    arr[k++] = left[i++];
                } 
            else {

                arr[k++] = right[j++];

               
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
       
        return profit;
    }

    

    private static int mergeSortAndCount(int[] arr, int l, int r ,int profit) {

       

        if (l - r >= 0)
            return 0;
        // if (l < r) {
        else {
            int m = (l + r) / 2;


         
            int lmax = mergeSortAndCount(arr, l, m,0);

            int rmax = mergeSortAndCount(arr, m + 1, r,0);

            int smax = mergeAndCount(arr, l, m, r);

        
            return Math.max(lmax, Math.max(rmax, smax));
        }

    }

}
