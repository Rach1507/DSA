public class subArrAvg {

// if uve computed window of size k , at every iteration just move the left , add the l+k-1 , reduce the computation
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int res = 0, currSum = 0;
    
            for (int i = 0; i < k - 1; i++) {
                currSum += arr[i];
            }
    
            for (int l = 0; l < arr.length - k + 1; l++) {
                currSum += arr[l + k - 1];
                if ((currSum / k) >= threshold) {
                    res++;
                }
                currSum -= arr[l];
            }
            return res;
        }

        public int numOfSubarraysSubOptimal(int[] arr, int k, int threshold) {
    
            // keep 2 pointers
            int left = 0, subArrsum = 0, no = 0, currSize = 0 ;
            for (int right = 0; right < arr.length; right++) {
                if (right - left >= k) {
                    subArrsum -= arr[left];
                    left++;
                }
                // add
                subArrsum += arr[right];
        
                // //
                if ((right - left)+1 == k) {
                    if ((subArrsum / k )>= threshold){
                        // System.out.println("subArrsum" +subArrsum);
                        // System.out.println("k" +k);
                        // System.out.println("threshold" +threshold);
    
    
                        no++;
                    }
                }
    
            }
            return no;
        }



}
