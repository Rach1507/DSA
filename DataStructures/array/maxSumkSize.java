
// package level 1;

// public Max Sum Subarray of size K 
// Basic Accuracy: 59.45% Submissions: 3787 Points: 1
// Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
import java.util.ArrayList;
 

// Example 1:

// Input:
// N = 4, K = 2
// Arr = [100, 200, 300, 400]
// Output:
// 700
// Explanation:
// Arr3  + Arr4 =700,
// which is maximum.
public class maxSumkSize {
    

    static int maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        
        int max_sum = Integer.MIN_VALUE;

       // Consider all blocks starting with i.
       for (int i = 0; i < n - k + 1; i++) {
           int current_sum = 0;
           for (int j = i; j < i+k; j++)
               current_sum = current_sum + arr.get(j);

           // Update result if required.
           max_sum = Math.max(current_sum, max_sum);
       }

       return max_sum;
       
       
    //    It can be observed from the above code that the time complexity is O(k*n) as it contains two nested loops.

       
       // code here
   }



   static int maximumSumSubarr(int k, ArrayList<Integer> arr,int n){
        
    int max_sum = 0;
       // int window_sum =0;
   // Consider all blocks starting with i.
   
          if (n < k) {
       System.out.println("Invalid");
       return -1;
   }
   
   
   for (int i = 0; i < k ; i++) 
       max_sum += arr.get(i);
       
       
       int current_sum = max_sum;
       for (int j = k; j < n; j++)
         {  current_sum = current_sum + arr.get(j)-arr.get(j-k);

       // Update result if required.
       max_sum = Math.max(current_sum, max_sum);
   }
   
   return max_sum;
   

   }
}
