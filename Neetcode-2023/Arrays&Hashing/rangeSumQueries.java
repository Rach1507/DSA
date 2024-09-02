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


class NumArray {

    public int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return arr[right];
        }
        return arr[right]-arr[left-1];
    }
}
