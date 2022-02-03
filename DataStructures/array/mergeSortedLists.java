import java.util.Arrays;

/*


MERGE 2 SORTED LISTS WITHOUT USING EXTRA SPACE


You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/


public class mergeSortedLists {

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            
         
            
            int left = m-1, right = n-1, arr_index = nums1.length-1;
    
            while ( left >= 0 && right >=0 ) {
    
                if (nums1[left] >= nums2[right])
                    nums1[arr_index--] = nums1[left--];
    
                else
                    nums1[arr_index--] = nums2[right--];
    
            }
    
            while (left >= 0) {
               nums1[arr_index--] = nums1[left--];
    
            }
    
            /* Copy remaining elements of R[] if any */
            while (right >=0) {
                nums1[arr_index--] = nums2[right--];
    
            }
    
        }
        
    



    

        /*
        
        Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.


                Example 1:

                Input:
                N = 4, M = 5
                arr1[] = {1, 3, 5, 7}
                arr2[] = {0, 2, 6, 8, 9}
                Output: 0 1 2 3 5 6 7 8 9
                Explanation: Since you can't use any 
                extra space, modify the given arrays
                to form 
                arr1[] = {0, 1, 2, 3}
                arr2[] = {5, 6, 7, 8, 9}

                Example 2:

                Input:
                N = 2, M = 3
                arr1[] = {10, 12}
                arr2[] = {5, 18, 20}
                Output: 5 10 12 18 20
                Explanation: Since you can't use any
                extra space, modify the given arrays
                to form 
                arr1[] = {5, 10}
                arr2[] = {12, 18, 20} */
                        // passing 302 test cases


        public static void merge(int arr1[], int arr2[], int n, int m) {
        int l = n-1,r=m-1;
        
        while(r >= 0){

            if(arr2[r] < arr1[l] ){
                
                int temp = arr1[l];
                arr1[l]=arr2[r];
                arr2[r]=temp;
     
            
            
              while(l>0 && arr1[l] < arr1[l-1]){
                    
                int te = arr1[l-1];
                arr1[l-1]=arr1[l];
                arr1[l]=te;
                
                l--;
              }
               
                   
            }  
            
            
            l = n-1;
            
            
            r--;
        }
        
     
        
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int arr1[] = new int[]{1, 3, 5, 7};
        int arr2[] = new int[]{0, 2, 6, 8, 9};

        merge(arr1,arr2,arr1.length,arr2.length);
       printArray(arr1);
       printArray(arr2);

    }
}