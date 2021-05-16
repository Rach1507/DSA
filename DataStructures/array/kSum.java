import java.util.Arrays;

public class kSum {


      
    static int   getPairsCount(int[] arr, int n, int k) {
        // code here
        int cnt = 0;
        Arrays.sort(arr);
        java.util.HashMap<Integer, Integer> CountMap = new java.util.HashMap<Integer, Integer>();

        for (int i : arr) {

            if (CountMap.containsKey(i)) 
                CountMap.put(i, CountMap.get(i) + 1);
                    
            else
                CountMap.put(i, 1);

        }

        // for (int i = 0; i < n - 1; i++) {
            // int indx2 = Arrays.binarySearch(Arrays.copyOfRange(arr, i + 1, n - 1), k - arr[i]);

            // for (int i = 0; i < n /2; i++) {
            //     int indx2 = Arrays.binarySearch(arr, k - arr[i]);
            //     if (indx2 >= 0)
            //         cnt++;
            // }




            for (int i = 0; i < n-1; i++) {
                if (arr[i] > k)
                    break;

                
                // int indx2 = Arrays.binarySearch(arr, k - arr[i]);
                // int indx2 = Arrays.binarySearch(Arrays.copyOfRange(arr, i, n - 1), k - arr[i]);
                // if (indx2 >= 0)

                if (CountMap.containsKey( k - arr[i])) 
                    {
                        cnt= cnt+ CountMap.get( k - arr[i]);
                        // System.out.println(cnt+" "+indx2+") "+ arr[indx2]+" "+i+" )"+arr[i]);
                    }
            }
        
            return cnt/2;
        // return cnt;
    }
  public static void main(String[] args) {
        // int[] arr = {1, 5, 7, 1};
        int[] arr = {48 ,24 ,99, 51 ,33, 39, 29 ,83 ,74 ,72, 22, 46 ,40, 51, 67, 37 ,78 ,76,26 ,28 ,76, 25, 10, 65, 64 ,47, 34, 88, 26, 49 ,
            86 ,73 ,73 ,36, 75, 5 ,26, 4 ,39 ,99, 27, 12 ,97, 67 ,63, 15, 3, 92, 90};
        System.out.println(getPairsCount(arr, arr.length,50));

    }
}