public class rangeSumQueries {
    int prefix[];

    public rangeSumQueries(int[] nums) {
        prefix = new int[nums.length+1];
        prefix[0] =0;

        for(int i = 0 ;i < nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
