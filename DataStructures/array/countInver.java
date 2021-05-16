import java.util.Arrays;

class countInver{
     static int count = 0;
    public static void main(String[] args) {
        // int[]  arr= {1,3,2,6};
        int[] arr ={2, 4, 1, 3, 5};
        // System.out.println(sortAndcount(arr,0,5));
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
    }

    // private static int sortAndcount(int[] arr,int start ,int n) {

        
    //     if (n == 1) return 0;

    //     else
    //        {
    //            int m = (start+n)/2;
    //          int l = sortAndcount(arr,start,m);
    //         int r = sortAndcount(arr,m+1,n);
    //         int sp = countSplit(arr,start,m,n);
    //         return l + r +sp;
    //        }

    // }
            
    

    // private static int countSplit(int[] arr, int l, int m,int r) {
    //     int cnt=0,i=l,j=m;
        

    //     // for(int k =0;k<r;k++)
    //     while(i<m && j<r)
    //         {   
    //             if(arr[i]<=arr[j])
    //                 i++;
    //             else if (arr[j]<arr[i])
    //                 {
    //                     System.out.println(arr[i] + " "+ arr[j]);
    //                     cnt +=( m+1)-i;
    //                     // cnt +=(m + 1) - (l + i);
    //                     j++;
    //                 }

    //         }

    //     // if (i>m)

    //     return cnt;
    // }




    private static int mergeAndCount(int[] arr, int l, int m, int r) {

        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    // Merge sort function
    // private static int mergeSortAndCount(int[] arr, int l, int r) {

    //     // Keeps track of the inversion count at a
    //     // particular node of the recursion tree
    //     int count = 0;

    //     if (l < r) {
    //         int m = (l + r) / 2;

    //         // Total inversion count = left subarray count
    //         // + right subarray count + merge count

    //         // Left subarray count
    //         count += mergeSortAndCount(arr, l, m);

    //         // Right subarray count
    //         count += mergeSortAndCount(arr, m + 1, r);

    //         // Merge count
    //         count += mergeAndCount(arr, l, m, r);
    //     }

    //     return count;
    // }


    private static int mergeSortAndCount(int[] arr, int l, int r) {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
       
        if (l - r >=0)
            return 0;
        // if (l < r) {
        else
           { 
               int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            int le= mergeSortAndCount(arr, l, m);

            // Right subarray count
            int ri = mergeSortAndCount(arr, m + 1, r);

            // Merge count
            int sp = mergeAndCount(arr, l, m, r);

            return le+ri+sp;
        }

    }

   



}