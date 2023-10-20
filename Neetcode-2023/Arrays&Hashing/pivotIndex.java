//Accepted - 1ms
//time taken - 7 mins




public class pivotIndex {
    class Solution {

        public int pivotIndex(int[] nums) {

            int rightSum = 0, leftSum = 0;

            for (int i = 0; i < nums.length; i++) {
                rightSum += nums[i];
            }

            for (int j = 0; j < nums.length; j++) {
                if (j > 0)
                    leftSum += nums[j - 1];
                rightSum -= nums[j];

                if (leftSum == rightSum)
                    return j;
            }

            return -1;

        }
    }
}
