public class minSubArrSize {

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
