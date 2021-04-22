// package sorting;

import java.util.*;

public class mergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // /* Create temp arrays */
        // int L[] = new int[n1];
        // int R[] = new int[n2];
 
        // /*Copy data to temp arrays*/
        // for (int i = 0; i < n1; ++i)
        //     L[i] = arr[l + i];
        // for (int j = 0; j < n2; ++j)
        //     R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = m+1;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (arr[i] <= arr[j]) {
                arr[k] = arr[i];
                i++;
            }
            else {
                arr[k] = arr[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = arr[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = arr[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    { 
        if (l < r) {
            // Find the middle point
            int mid = (l + r) / 2;
 
            // Sort first and second halves
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
            
        }
    }
 
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
        int ar1[] = { 10,12 };
        int ar2[] = { 5,18,20 ,16};
        // System.out.println("Given Array");
        // // printArray(ar1);
 
        mergeSort ob = new mergeSort();
        ob.sort(ar1, 0, ar1.length - 1);
        ob.sort(ar2, 0, ar2.length - 1);
        System.out.println("\nSorted array");
        printArray(ar1);
        printArray(ar2);


// Merge the sorted halves
// merge(ar1,ar2, l, mid, r);

    }
}

    
