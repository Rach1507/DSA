import java.util.*;

public class Maxconsective {
    public int lengthOfLongestSubstring(String s) {

        // abwpwkew
        if (s.length() == 0)
            return 0;

        // maintain a map
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLen = 1, nextLeft = 0;
        Character ch = s.charAt(right);

        while (right <= s.length() - 1) {
            ch = s.charAt(right);
            if (map.containsKey(ch)) {
                nextLeft = map.get(ch);
                maxLen = Math.max(maxLen, right - left);
                while (left <= nextLeft) {
                    map.remove(s.charAt(left));
                    left++;
                }

                continue;
            } else {
                map.put(ch, right);
                right++;
                if (right == s.length())
                    maxLen = Math.max(maxLen, right - left);
            }

        }

        return maxLen;
    }
} 
