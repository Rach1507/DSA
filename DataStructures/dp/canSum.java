import java.util.Arrays;
import java.util.HashMap;

public class canSum {
    public static boolean canSumToTarget(int target, int[] arr) {

        if (target == 0)
            return true;

        for (int i = 0; i < arr.length; i++) {

            int remainder = target - arr[i];
            if (remainder < 0)
                return false;

            for (int j = 0; j < arr.length; j++) {
                return canSumToTarget(remainder, arr);
            }
        }
        return false;
    }

    public static boolean canSumToTargetDP(int target, int[] arr, HashMap<Integer, Boolean> memo) {

        if(target == 0) {
            memo.put(target, true);
            return true;
        }

        if(memo.containsKey(target)) return memo.get(target);

        for (int i = 0; i < arr.length; i++) {

            int remainder = target - arr[i];


            if (remainder < 0) {
                memo.put(target,false);
                return false;
            }

            for (int j = 0; j < arr.length; j++) {
                Boolean res = canSumToTargetDP(remainder, arr ,memo);
                memo.put(target, res);
                return res;
        
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target =7;
        int [] arr = {5,4};
        HashMap<Integer,Boolean> memo = new HashMap<>();
        

        System.out.println(canSumToTargetDP(target, arr, memo));
    }
}
