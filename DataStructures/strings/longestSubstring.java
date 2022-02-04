import java.util.HashSet;
import java.util.Set;

/*



                            Longest Substring Without Repeating Characters
                            


      Given a string s, find the length of the longest substring without repeating characters.

 

            Example 1:

            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.
            Example 2:

            Input: s = "bbbbb"
            Output: 1
            Explanation: The answer is "b", with the length of 1.
            Example 3:

            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */

public class longestSubstring {
 
        public int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        
        while (j < s.length()) {
            
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            else 
            {
                set.remove(s.charAt(i++));
            }
        }
        
        return max;
        }

        // public int lengthOfLongestSubstring(String s) {
        
        
        
        //     int n = s.length();
        //     int[] chars = new int[256];
           
        //     int res = 0;
    
       
        //     for (int i = 0; i < n; i++) {
                
          
        //          Arrays.fill(chars,0);
                
        //         for (int j = i; j < n; j++) {
                    
        //              char c = s.charAt(j);
                        
                    
        //             if(chars[c] == 1) {
                    
        //                 break;
        //             }
                    
        //             else{
        //                 chars[c]++;
        //                 res = Math.max(res, j - i + 1); 
        //             }
                  
        //             }
        //         }
        //  return res;
        // }
    
}
