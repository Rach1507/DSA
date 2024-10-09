public class minSubArrSize {

        public int minSubArrayLenOptimal(int target, int[] nums) {
            int left = 0, right = 0, minLen = Integer.MAX_VALUE;
            int total = nums[0];
    
            while (right <= nums.length - 1) {
    
                if (total >= target) {
                    minLen = Math.min(minLen, right - left + 1);
                    total = total - nums[left];
                    left++;
                    continue;
                } else {
                    right++;
                }
                if(right <= nums.length - 1)total += nums[right];
    
            }
    
            if (minLen == Integer.MAX_VALUE)
                return 0;
            return minLen;
    
        }


        public int minSubArrayLen(int target, int[] arr) {
            // positive intergers 
            // positive target 
    
            // start from window size 1 - as soon as u find , return the windowSize 
            // worst case - o(n)
            
            // optimise - i would sort? its subarray - so no 
            //, and start with highest window size ? index , just keep subtracting sum 
    
            int windowSize = 1,currSum=0 ;
    
            while(windowSize <= arr.length ){
    
                currSum=0 ;
                for (int i = 0; i < windowSize - 1; i++) {
                            currSum += arr[i];
                }
        
                for (int l = 0; l < arr.length - windowSize + 1; l++) {
                    currSum += arr[l + windowSize - 1];
                    if (currSum >= target ) {
                        return windowSize;
                    }
                    currSum -= arr[l];
                }
    
                windowSize++;  
            }
            
            return 0;
        }

}
