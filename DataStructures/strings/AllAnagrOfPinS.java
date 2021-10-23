import java.util.*;

public class AllAnagrOfPinS {
 
        static int[] map;

        public static  List<Integer> findAnagrams(String s, String p) {

            List<Integer> list = new ArrayList<>();

            map = new int[26];

            Arrays.fill(map, 0);

            for (int i = 0; i < p.length(); i++)
                map[p.charAt(i) - 'a']++;

            int start = 0, end = p.length() - 1;

            while (end < s.length()) {
                if (check(s, start, end)) {
                    list.add(start);
                }
                start++;
                end++;
                // }

                // else
                // {
                // start=end+2;
                // end += 4;

                // }

            }

            return list;
        }

        static Boolean check(String s, int start, int end) {
            int[] Pmap = Arrays.copyOf(map, map.length);
            for (int i = start; i <= end; i++) {

                if (Pmap[s.charAt(i) - 'a'] <= 0)
                    return false;

                else
                    Pmap[s.charAt(i) - 'a']--;

            }
            return true;

        }
        public static void main(String[] args) {
            System.out.println(findAnagrams("abcbabababc", "abc"));
        }
 

}
