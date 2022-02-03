// package sorting;

import java.util.*;


/*



if (l == r ) return arr;










*/
public class mergeSortNew {

    void merge(int arr[], int low, int m, int end) {

        // copy left half
        // copy right half

        int[] l = Arrays.copyOfRange(arr, low, m + 1);
        int[] r = Arrays.copyOfRange(arr, m + 1, end + 1);

        int left = 0, right = 0, arr_index = low;

        while (left < l.length && right < r.length) {

            if (l[left] <= r[right])
                arr[arr_index++] = l[left++];

            else
                arr[arr_index++] = r[right++];

        }

        while (left < l.length) {
            arr[arr_index++] = l[left++];

        }

        /* Copy remaining elements of R[] if any */
        while (right < r.length) {
            arr[arr_index++] = r[right++];

        }

    }

    void mergeSort(int arr[], int l, int r) {
        // if(l==r) return ;
        // else
            // get middle ==== r-l + l /2
            // spilt left including mid
            // split right from mid+1
            // merge 


        if (l == r ) return ;
        else{
        // if (l < r) {

           
            int mid = l + (r - l) / 2;



            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int ar1[] = { 10, 12 };
        int ar2[] = { 5, 18, 20, 16 };
        // System.out.println("Given Array");
        // // printArray(ar1);

        mergeSortNew ob = new mergeSortNew();
        ob.mergeSort(ar1, 0, ar1.length - 1);
        ob.mergeSort(ar2, 0, ar2.length - 1);
        System.out.println("\nSorted array");
        printArray(ar1);
        printArray(ar2);

     

    }

}

// // Find sizes of two subarrays to be merged
// int n1 = m - l + 1;
// int n2 = r - m;

// // /* Create temp arrays */
// // int L[] = new int[n1];
// // int R[] = new int[n2];

// // /*Copy data to temp arrays*/
// // for (int i = 0; i < n1; ++i)
// // L[i] = arr[l + i];
// // for (int j = 0; j < n2; ++j)
// // R[j] = arr[m + 1 + j];

