import java.util.HashMap;

public class subArrSum {
    public int subarraySum(int[] nums, int k) {
        int totalNoOfSubarr = 0;

        for (int i = 0; i < nums.length; i++) {
            int currSum = nums[i];
            if (currSum == k)
                totalNoOfSubarr++;

            for (int j = i + 1; j < nums.length; j++) {
                currSum += nums[j];
                if (currSum == k)
                    totalNoOfSubarr++;
            }
        }

        return totalNoOfSubarr;
    }
}

class SolutionFinalOOFN {
    HashMap<Integer,Integer> map;
    public int subarraySum(int[] nums, int k) {
        int count = 0, sumUntilNow = 0 ;
        map = new HashMap<>();
        map.put(0, 1); 

        for(int i = 0;i<nums.length;i++){
            sumUntilNow += nums[i];
            if(map.containsKey(sumUntilNow - k)) 
                count +=  map.get(sumUntilNow - k);
            addToMap(sumUntilNow);
        }
        return count;
    }

    private void addToMap(int sum){
        if(map.containsKey(sum)) map.put(sum ,map.get(sum)+1);
        else map.put(sum ,1);
    }
}

class subArrSumK {
    public int subarraySum(int[] nums, int k) {

        // have a prefix sum
        // Complexity Analysis

        // Time complexity : O(n
        // 2
        // ). Considering every possible subarray takes O(n
        // 2
        // ) time. Finding out the sum of any subarray takes O(1) time after the initial
        // processing of O(n) for creating the cumulative sum array.

        // Space complexity : O(n). Cumulative sum array sum of size n+1 is used

        int[] prefixSum = new int[nums.length + 1];

        prefixSum[1] = nums[0];
        prefixSum[0] = 0;

        for (int I = 1; I <= nums.length; I++) {
            prefixSum[I] = nums[I - 1] + prefixSum[I - 1];
            // System.out.println(prefixSum[I]);
        }

        int count = 0, start = 0, end = 0;

        for (int windowSize = nums.length; windowSize > 0; windowSize--) {
            start = 0;
            end = windowSize - 1;

            while (end < nums.length) {
                // System.out.println("end "+end +" prefixSum[end+1] "+prefixSum[end+1] );
                // System.out.println("start "+start +" prefixSum[start] "+prefixSum[start]);

                if (prefixSum[end + 1] - prefixSum[start] == k) {
                    // System.out.println("count "+count);
                    count++;
                }
                end++;
                start++;
            }
        }

        return count;

    }
}

