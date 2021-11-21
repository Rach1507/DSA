import java.util.*;

public class howSum {
//     public static ArrayList<Integer> how(int target, int[] nums) {

//         if (target == 0)
//             return new ArrayList<Integer>();

//         if (target < 0)
//             return null;

//         for (int i = 0; i < nums.length; i++) {
            
//             ArrayList<Integer> res = how(target - nums[i], nums);
//             if (res != null) {
//                 res.add(nums[i]);
//                 return res;

//             }
//         }

// return null;
//     }


public static ArrayList<Integer> how(int target, int[] nums, HashMap<Integer, ArrayList<Integer>> memo) {

            if(memo.containsKey(target) ) return memo.get(target);
        if (target == 0)
        return new ArrayList<Integer>();

        if (target < 0)
        return null;

        for (int i = 0; i < nums.length; i++) {

                ArrayList<Integer> res = how(target - nums[i], nums,memo);
                if (res != null) {
                res.add(nums[i]);
                memo.put(target, res);
                return memo.get(target);
                }
                }
                memo.put(target, null);
                return null;
}


public static void main(String[] args) {
    int[] arr = new int[2];
 
    arr[0] = 6;
    arr[1] = 2;
    Integer[] result = new Integer[20];

    HashMap<Integer,ArrayList<Integer>> memo = new HashMap<>();
  
//   result =  how(12,arr).toArray(result);
result = how(12, arr,memo).toArray(result);
System.out.println(result[0]);
System.out.println(result[1]);
}
}