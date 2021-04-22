import java.util.Arrays;

public class gaurd {
    // private static int theifIdx;

    // public static void main(String[] args) {
    // // String floor = "xxxxG$Txx";
    // // String floor = "TxxxGxxx$xx";
    // String floor ="xx$GTxxxx";
    // System.out.println(isSafe(floor));

    // }

    private static String isSafe(String floor) {

        int guardIdx = Arrays.binarySearch(floor.toCharArray(), 'G');

        int theifIdx = Arrays.binarySearch(floor.toCharArray(), 'T');
        if (guardIdx < theifIdx) {
            for (int i = guardIdx + 1; i < theifIdx; i++)
                if (floor.charAt(i) == '$')
                    return "ALARM!";
        }

        else
            for (int i = theifIdx + 1; i < guardIdx; i++)
                if (floor.charAt(i) == '$')
                    return "ALARM!";

        return "quiet";
    }

    public static void main(String[] args) {

        // int[] arr= {4 , 2 ,-3, 1, 6};

        // System.out.println(subset(arr,0,0));
        int a[] = {4 ,2 ,0 ,1, 6};//-2 1 1 4 5
        // boolean b = true;
        Arrays.sort(a);
        int sum = -1;
        if (a[0] < 0)
            for (int i = 0; i < a.length; i++)
             {
                sum = a[i];
                if (a[i] == 0)
                    break;
                for (int j = i + 1; j < a.length; j++) {
                    sum += a[j];
                    if (sum == 0) {
                        break;
                    }
                }
                if (sum == 0)
                    break;
            }
        if (sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static boolean subset(int[] list, int start_idx, int sum) {

        if (list.length - start_idx == 1) {
            if (list[start_idx] == sum)
                return true;
            else
                return false;
        }

        boolean result_1 = subset(list, start_idx + 1, sum - list[start_idx]);

        boolean result_2 = subset(list, start_idx + 1, sum);

        return result_1 || result_2;
    }
}