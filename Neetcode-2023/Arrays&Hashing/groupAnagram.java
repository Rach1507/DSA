import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {

    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();

        Map<String, ArrayList<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca); // sorted String

            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());

            ans.get(key).add(s);
        }
        // convert directly our HashMap's Values to Arraylist
        return new ArrayList(ans.values());

    }

    public List<List<String>> groupAnagramsSemiOptimal(String[] strs) {
        // hashmap
        // "sortedStr" - ["originalStr"]
        // loop through
        // sort this string , check if it exists in map , if exists , push/ add to key
        // if not - map.put()

        // return values() - list - convert to normal array

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            String sorted = sortString(str);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(str);
            } else {
                map.put(sorted, new ArrayList<String>() {
                    {
                        add(str);
                    }
                });
            }
        }
        return List.copyOf(map.values());

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}
