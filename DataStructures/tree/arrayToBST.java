public class arrayToBST {
    static int bst[];
    static int i = 0;

    public int[] sortedArrayToBST(int[] nums)

    {

        int n = nums.length;
        bst = new int[n];
        insert(nums, 0, n - 1);
        return bst;

        // while(left<0){
        // bst[i++]=

        // }

        // Code here
    }

    public void insert(int[] nums, int start, int end) {

        if (start == end)
            return;

        int mid = (start + end) / 2;

        bst[i++] = nums[mid];
        insert(nums, start, mid - 1);
        insert(nums, mid + 1, end - 1);
    }

}
