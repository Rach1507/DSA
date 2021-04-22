import java.util.Arrays;
import java.util.HashMap;

public class goodPair {
    static int good_pairs(int n, int[] arr) {
        int result = 0;
        // Arrays.sort(arr);
        // for(int i =0;i<n-1;i++)
        // if(arr[i]==arr[i+1])
        // result++;

        HashMap<Integer, Integer> CountMap = new HashMap<Integer, Integer>();

        //

        for (Integer c : arr) {

            if (CountMap.containsKey(c)) {
                int cnt = CountMap.get(c);
                CountMap.put(c, cnt + 1);
                result += cnt;
            }
            //

            else
                CountMap.put(c, 1);

        }

        return result;

    }

    static long solve(int[] arr) {
        long res = 0;
        // Arrays.sort(arr);
        int max;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            max = arr[i];
            for (int j = i + 1; j < n; j++)

            {
                if (arr[j] > max)
                    max = arr[j];
                // System.out.println(arr[i] * arr[j]);
                if (arr[i] * arr[j] <= max) {
                    // System.out.println(i+" "+j);
                    res = res + 1;
                }

            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 4, 2 };
        System.out.println(good_pairs(arr.length, arr));
        System.out.println(solve(arr));
    }
}
