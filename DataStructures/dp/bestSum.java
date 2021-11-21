import java.util.ArrayList;
import java.util.HashMap;

public class bestSum {
public static ArrayList<Integer> best(int target, int[] nums, HashMap<Integer, ArrayList<Integer>> memo) {

            if(memo.containsKey(target) ) return memo.get(target);
        if (target == 0)
        return new ArrayList<Integer>();

        if (target < 0)
        return null;

        for (int i = 0; i < nums.length; i++) {
             ArrayList<Integer> smallest=null;
                ArrayList<Integer> res = best(target - nums[i], nums,memo);
                if (res != null) {
                res.add(nums[i]);

                if(smallest == null || smallest.size() > res.size())
                memo.put(target, res);


                return memo.get(target);
                }
                }
                memo.put(target, null);
                return null;
}






public static void main(String[] args) {
    int[] arr = new int[2];
 
    arr[0] = 5;
    arr[1] = 2;
    Integer[] result = new Integer[12];
    HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();

//   result =  best(12,arr,memo).toArray(result);

  System.out.println(best(12,arr,memo));

}


}
