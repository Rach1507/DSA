//Accepted - 1ms
//time taken - 7 mins

public class pivotIndex {

    public int pivotIndexPreFix(int[] nums) {

        int prefix[] = new int[nums.length + 1];
        prefix[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int rightSum = 0, leftSum = 0, n = nums.length;

        for (int j = 0; j < nums.length; j++) {

            rightSum = prefix[n] - prefix[j + 1];
            leftSum = prefix[j];

            if (leftSum == rightSum)
                return j;
        }

        return -1;

    }

    public int pivotIdx(int[] nums) {

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
