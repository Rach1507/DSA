import java.util.Arrays;
import java.util.HashMap;

class twoSum {
    public static boolean keypair(int[] A, int n, int X) {
        // code here

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer ele : A) {
            hm.computeIfPresent(ele, (key, val) -> val + 1);
            hm.computeIfAbsent(ele, k -> 1);
        }
      
        for (int i = 0; i < n; i++)
            if (hm.containsKey(X - A[i])) {
                if (X - A[i] == A[i] && hm.get(X - A[i]) == 1)
                    continue;
                return true;
            }
        return false;

    }
public static boolean findPair(int[] A, int n, int X) {

    int l, r;

    /* Sort the elements */
    Arrays.sort(A);

    /*
     * Now look for the two candidates in the sorted array
     */
    l=0;r=n-1;
    while(l<r)
    {
        if (A[l] + A[r] == X)
            return true;
        else if (A[l] + A[r] < X)
            l++;
        else // A[i] + A[j] > sum
            r--;
    }
    return false;
}
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        System.out.println(keypair(A, A.length, 16));
        System.out.println(findPair(A, A.length, 16));
    }

}