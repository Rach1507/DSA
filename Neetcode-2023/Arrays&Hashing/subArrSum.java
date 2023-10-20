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
