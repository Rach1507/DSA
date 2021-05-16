import java.util.*;

public class allPermNums {
    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> allPerms = new LinkedList<List<Integer>>();

        Integer[] num = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.valueOf(nums[i]);
        }

        permute(allPerms, num, 0, n - 1);

        return allPerms;

    }

    public static List<List<Integer>> permute(List<List<Integer>> allPerms, Integer[] num, int l, int r) {

        for (int i = l; i <= r; i++) {
            if (l == r) {
                List<Integer> intList = new LinkedList<Integer>();
                for (int j = 0; j < num.length; j++)
                    System.out.print(num[j] + " ");

                    System.out.println();

                    for (Integer ele : num)
                        intList.add(ele);

                allPerms.add(intList);
            } else {
                num = fixLetter(num, l, i);
                permute(allPerms, num, l + 1, r);
                num = fixLetter(num, l, i);
            }
        }

        return allPerms;

    }

    static Integer[] fixLetter(Integer[] num, int first, int second ){

        Integer temp;

        temp = num[first];
        num[first] = num[second];
        num[second] = temp;

        // for (int j = 0; j < num.length; j++)
        //     System.out.print(num[j] + " ");

        //  System.out.println();   
        return num;

    }

    public static void main(String[] args) {

        System.out.println(permute(new int[] { 1, 2, 3 }));
    }
}
