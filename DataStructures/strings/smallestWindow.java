import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;
import java.util.Map;



public class smallestWindow {

    public static String smallestWindow(String s, String p) {
        HashMap<Character, Integer> winHash = new HashMap<>();
        HashMap<Character, Integer> pHash = new HashMap<>();
        int window_size = p.length();
        computeCountMap(pHash, p);
        // System.out.println("pHAsh "+pHash);
        

        while (window_size <= s.length()) {
            int l = 0;
            int r = window_size - 1;
            // System.out.println("window " +window_size);
            computeCountMap(winHash, s.substring(l, r+1));
            // System.out.println("winHash for "+l+" "+ r+ " "+ winHash);
            while (r < s.length()) {



                System.out.println("winHash for " + l + " " + (r)+ " " + winHash);



                if (compareMap(pHash, winHash))

                    return s.substring(l, r+1);

                if (r + 1 >= s.length())
                    break;
                Character leftKey =s.charAt(l),rightKey = s.charAt(++r);
                // System.out.println(leftKey+" "+rightKey);






                if(winHash.get(leftKey) == 1) 
                winHash.remove(leftKey);
                else
           
                winHash.computeIfPresent(leftKey, (key, val) -> val - 1);
           


                // System.out.println(r);


                winHash.computeIfPresent(rightKey, (key, val) -> val + 1);
                winHash.computeIfAbsent(rightKey, k -> 1);


                l++;


            }

            window_size++;
        }

        return "-1";

    }

    private static boolean compareMap(HashMap<Character, Integer> pHash, HashMap<Character, Integer> winHash) {

        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : pHash.entrySet()) {

            Character charkey = entry.getKey();

            if (winHash.keySet().contains(charkey)) {
                if (entry.getValue() <= winHash.get(charkey))
                    flag = true;
                else {
                  return false;
                }

            } 
            else
                return false;

        }

        if (flag)
            return true;

        return false;

    }

    private static void computeCountMap(HashMap<Character, Integer> map, String str) {

        map.clear();
        for (int i = 0; i < str.length(); i++) {

            map.computeIfPresent(str.charAt(i), (key, val) -> val + 1);
            map.computeIfAbsent(str.charAt(i), k -> 1);
        }

    }

    public static void main(String[] args) {
        // String S = "timetopractice", P = "toc";
        String S = "zoomlazapzo"
,P = "oza";
        System.out.println(smallestWindow(S, P));
    }

}

// while(r<window_size){winHash.computeIfPresent(s.charAt(r),(key,val)->val+1);winHash.computeIfAbsent(s.charAt(r),k->1);

// r++;

// }

// while(r<s.length()-1)

// {winHash.remove(s.charAt(l));l++;r++;winHash.computeIfPresent(s.charAt(r),(key,val)->val+1);winHash.computeIfAbsent(s.charAt(r),k->1);

// if(pHash.entrySet().containsAll(winHash.entrySet()))return s.substring(l,r);

// }

// window_size++;

// }

// return"-1";

// // Your code here
// }

// private static boolean contains(HashMap<Character, Integer> winHash,
// HashMap<Character, Integer> pHash) {
// boolean flag =false;
// for (Map.Entry entry1 : winHash.entrySet()) {
// Character key1 = (Character) entry1.getKey();
// int hash1 = System.identityHashCode(key1);
// Integer value1 = (Integer) entry1.getValue();
// for (Map.Entry entry2 : pHash.entrySet()) {
// Character key2 = (Character) entry2.getKey();
// if (key1 > System.identityHashCode(key2))
// continue;

// Integer value2 = (Integer) entry1.getValue();

// if(value1== value2)
// flag= true;
// else
// flag=false;
// // compare value1 and value2;
// }
// }
// if(flag)return true;
// return false;
// }