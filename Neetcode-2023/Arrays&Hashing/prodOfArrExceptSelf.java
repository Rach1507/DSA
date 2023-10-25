public class prodOfArrExceptSelf {
    public int[] productExceptSelf(int[] nums) {

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
}
