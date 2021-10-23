import java.util.*;

public class countWays {
    


    static int[] part1, part2;

    static boolean checkFreq(int m) {
        int cnt = 0;
        for (int i = 0; i < 26; i++) {

            if (part1[i]!=0 && (part1[i] == part2[i]))
                cnt++;
            if (cnt >= m)
                return true;
        }
        return false;
    }

    static int countWay(String str, int m) {
        int ways = 0;
        part1 = new int[26];
        part2 = new int[26];
        Arrays.fill(part1, 0);
        Arrays.fill(part2, 0);

        char a[] = str.toCharArray();
        int n = a.length;
    
        part1[a[0] - 'a']++;

        for (int i = 1; i < n; i++)
            part2[a[i] - 'a']++;

        // System.out.println();
        // System.out.println();


        if (checkFreq(m))
            ways++;

        for (int i = 1; i < n - 1; i++) {
            part1[a[i] - 'a']++;
            part2[a[i] - 'a']--;

            if (checkFreq(m))
                ways++;
        }
        return ways;
    }

   
    public static void main(String[] args) {
        String str = "aabbccaa";
        int m = 2;
        System.out.println(countWay(str, m));
    }


}
