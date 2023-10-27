public class searchInrotatedSortedArr {
    public int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1, mid = 0;

        while (start <= end) {

            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;

            // left sorted
            if (nums[start] <= nums[mid]) {
                if (target > nums[mid] || target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {// right sorted
                if (target < nums[mid] || target > nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;

    }
}
