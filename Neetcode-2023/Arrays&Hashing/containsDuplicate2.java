import java.util.HashMap;

class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

         HashMap<Integer,Integer> map = new HashMap<>();
         int start = 0 , end = -1;

         for(int z =0;z<=k;z++){
            if(z >= nums.length){return false;}
            end++;
            if(map.containsKey(nums[z])) return true;
            else map.put(nums[z], z);
         }

        while(end < nums.length-1){
            end++;
            map.remove(nums[start]);
            start++;
            if(map.containsKey(nums[end])) return true;
            else map.put(nums[end], end);
        }

    return false;
    }

    //  public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    //     int i ; 
    //     int j ;
        
    //     for(int z =1;z<=k;z++){
    //          i = 0 ;
    //          j = i + z ;

    //         while(j < nums.length){
    //             if(nums[i] == nums[j]) return true;
    //             i++;j++;
    //         }
    //     }

    // return false;
    // }


    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     HashMap<Integer , ArrayList<Integer >> map = new HashMap<>();
    //     ArrayList<Integer> value ; 

    //     for(int i =0;i<nums.length;i++){
    //         if(map.containsKey(nums[i])){
    //             value = map.get(nums[i]);
    //             for(int index: value){
    //                 if(Math.abs(i - index) <= k)return true;
    //             }
    //             value.add(i);
    //         }
    //         else {
    //             value = new ArrayList<>();
    //             value.add(i);

    //             map.put(nums[i],value);
    //         }
    //     }
    // return false;
    // }
}