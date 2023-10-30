import java.util.HashMap;

public class lengthOfLongestSubString {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxwindowSize = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (!charMap.containsKey(currChar) || charMap.get(currChar) < start) {
                charMap.put(currChar, i);
                maxwindowSize = Math.max((i - start) + 1, maxwindowSize);
            } else {
                start = charMap.get(currChar) + 1;
                maxwindowSize = Math.max((i - start) + 1, maxwindowSize);

                charMap.put(currChar, i);

            }
        }
        return maxwindowSize;
    }
}
