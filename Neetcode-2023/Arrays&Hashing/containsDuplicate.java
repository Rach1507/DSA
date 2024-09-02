// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true


// Approach : loop through put into map , if map contains return false , if not until array is looped through completely , it has all unique

//Rev - 12 Aug 2023
//Rev - 24 aug 2024

import java.util.HashMap;

class containsDuplicate {
    public boolean containsDuplicates(int[] nums) {
        
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],i);
            else
                return true;
            }
        return false;
    }
}