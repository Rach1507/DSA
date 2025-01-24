public class matrixSearch {
        public boolean searchMatrix(int[][] matrix, int target) {
    
            // check first
            // loop througth each row , check first and last , if within range , do a binary
            // search
    
            // if not continue to next loop
    
            for (int i = 0; i < matrix.length; i++) {
    
                if (target >= matrix[i][0] 
                && target <= matrix[i][matrix[i].length - 1])
                    return search(matrix[i], target);
    
            }
    
            return false;
        }
    
        public boolean search(int[] nums, int target) {
            int left = 0, right = nums.length - 1, mid = 0;
            while (left <= right) {
                mid = left + (right - left) / 2;
    
                if (nums[mid] == target)
                    return true;
                if (nums[left] == target)
                    return true;
                if (nums[right] == target)
                    return true;
    
                if (target <= nums[mid])
                    right = mid - 1;
                if (target > nums[mid])
                    left = mid + 1;
            }
            return false;
    
        }

}
