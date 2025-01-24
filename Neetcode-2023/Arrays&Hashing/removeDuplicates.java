public class removeDuplicates {
    public int removeDuplicateCleanest(int[] nums) {
        int left = 0,right = 1;

        while(left < nums.length  && right < nums.length){
                if (nums[right]==nums[left]) right++;
                else nums[++left]=nums[right];
        }

        return left+1;
    }

    public int removeDuplicatesNeetcode(int[] nums) {
        int swap = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[swap] = nums[i];
                swap++;
            }
        }

        return swap;
    }
}
