public class prodOfArrExceptSelf {

    // 2 passes
    // 1 2 3 4
    // 1 1 2 6
    // 24 12 8 6

    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        ans[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int currPostfix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * currPostfix;
            currPostfix *= nums[i];
        }

        return ans;
    }

    public int[] productExceptSelfNeetcode(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public int[] productExceptSelfWith3ArraysPrefixSumConcept(int[] nums) {

        int ans[] = new int[nums.length];
        int productOfAlltoLeft[] = new int[nums.length];
        int productOfAlltoRight[] = new int[nums.length];

        productOfAlltoLeft[0] = 1;
        productOfAlltoRight[nums.length - 1] = 1;

        // 1 1 2 6
        // 24 12 4 1

        // 24 12 8 6

        // // i can cache the product of all to right

        for (int i = nums.length - 2; i >= 0; i--) {
            productOfAlltoRight[i] = productOfAlltoRight[i + 1] * nums[i + 1];
        }

        for (int i = 1; i < nums.length; i++) {
            productOfAlltoLeft[i] = productOfAlltoLeft[i - 1] * nums[i - 1];
        }

        ans[0] = productOfAlltoRight[0];
        ans[nums.length - 1] = productOfAlltoLeft[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            ans[i] = productOfAlltoLeft[i] * productOfAlltoRight[i];
        }

        return ans;
    }

    public int[] productExceptSelfPrefixSumConcept2Arrays(int[] nums) {
    
        int leftProduct[] = new int[nums.length];
        leftProduct[0] = 1;
        for(int n = 1 ; n < nums.length ;n++) leftProduct[n] = leftProduct[n-1] * nums[n-1];

        int rightProduct[] = new int[nums.length];
        rightProduct[nums.length-1] = 1;
        for(int n = nums.length-2  ; n >=0 ;n--) rightProduct[n] = rightProduct[n+1] * nums[n+1];

        for(int n = 0 ; n < nums.length ;n++) nums[n] = leftProduct[n] * rightProduct[n];

        return nums;

    }
}
