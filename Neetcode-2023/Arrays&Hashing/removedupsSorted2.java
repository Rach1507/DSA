public class removedupsSorted2 {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2)
            return nums.length;

        int r = 0, l = 0, count = 1;

        while (r < nums.length) {

            count = 1;
            r++;

            while (r < nums.length && nums[r] == nums[r - 1]) {
                r++;
                count++;
            }

            count = count >= 3 ? 2 : count;
            while (count > 0) {
                if (l < nums.length)
                    nums[l++] = nums[r - 1];
                count--;
            }

        }

        return l;

    }


         // [1,1,1,1,2,2,2,3,3]
        // [1,1,1,2,2,3]
        // [1,2,2,2,2,3]
        /*
         * 
         * 1-2
         * 
         * l =0 , r= 1 , count = 1;
         * 
         * // i encountered 1 value , count the number
         * run a nested loop
         * 
         * 
         * count = 1;
         * 
         * while( r < nums.length && nums[r] == nums[r-1])
         * r++;
         * count++;
         * 
         * count = count >= 3 ? 2 : count ;
         * while(count > 0)
         * if(l < nums.length) nums[l++] = nums[r-1];
         * count--;
         * 
         * 
         * 
         * 
         */
    
}
