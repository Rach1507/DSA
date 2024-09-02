// 167. Two Sum II - Input Array Is Sorted

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

 

// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
// Example 3:

// Input: numbers = [-1,0], target = -1
// Output: [1,2]
// Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


class twoSumSorted {

  public int[] twoSum(int[] numbers, int target) {


        //  2 pointers 

        int leftPointer = 0 ;
        int rightPointer = numbers.length-1;

        while(leftPointer < rightPointer){
            if(numbers[leftPointer] + numbers[rightPointer] == target)
                return new int[]{leftPointer+1,rightPointer+1};
            else if(numbers[leftPointer] + numbers[rightPointer] > target)
                rightPointer--;
            else
                leftPointer++;
        }

        // 2loops 

        // for(int i =0 ;i < numbers.length;i++){
        //     if(numbers[i] > 0 && numbers[i] > target) break;
        //     else{
        //         int nextIndex = i+1;
        //         while(nextIndex < numbers.length){
        //             if(numbers[i] +  numbers[nextIndex] == target){ 
        //                 return new int[]{i+1,nextIndex+1};
        //             }
        //             nextIndex++;
        //         }
        //     }
        // }
        
        return new int[2];
    }
    
}
