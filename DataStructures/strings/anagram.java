

import java.util.Arrays;
import java.util.HashMap;


// Given two strings a and b consisting of lowercase characters.
//  The task is to check whether two given strings are an anagram of each other or not. 
// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 

// Example 1:

// Input:
// a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same
// characters with same frequency. So, 
// both are anagrams.
// Example 2:

// Input:
// a = allergy, b = allergic
// Output: NO
// Explanation:Characters in both the strings
// are not same, so they are not anagrams.

public class anagram {
    private static final int NO_OF_CHARS = 256;

    public static boolean isAnagram(String a1, String b1) { // Time Complexity: O(nLogn)
        if (a1.length() == b1.length()) {
            char[] a = a1.toCharArray();
            char[] b = b1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);

            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i])
                    return false;

            return true;

        }
        return false;
        // Your code here

    }

    // iterate through every character of both strings and increment the count of
    // character in the corresponding count arrays.
    // use only one count array instead of two.
    // We can increment the value in count array for characters in str1 and
    // decrement for characters in str2. Finally, if all count values are 0, then
    // the two strings are anagram of each other.

    static boolean areAnagram(char[] str1, char[] str2) {

        // Create a count array and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;
        if (str1.length != str2.length)
            return false;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length; i++) {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }

        // If both strings are of different
        // length. Removing this condition
        // will make the program fail for
        // strings like "aaca" and "aca"
      

        // See if there is any non-zero
        // value in count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0) {
                return false;
            }
        return true;
    }

    static boolean isPermuation(char[] str1, char[] str2) {
        if (str1.length == str2.length) {
            HashMap<Character, Integer> charCount1 = new HashMap<>();

            for (Character letter : str1) {
                charCount1.computeIfPresent(letter, (key, val) -> val + 1);
                charCount1.computeIfAbsent(letter, key -> 1);

            }
            HashMap<Character, Integer> charCount2 = new HashMap<>();
            for (Character letter : str2) {
                charCount2.computeIfPresent(letter, (key, val) -> val + 1);
                charCount2.computeIfAbsent(letter, key -> 1);

            }

            if(charCount1.equals(charCount2))
                return true;



        }
        return false;
    }

    public static void main(String[] args) {
        // String s=AAAA;
        // String a = "geeksforgeeks", b = "forgeeksgeeks";
        String a = "geeksforgeeks", b = "forgeekgeeks";
        System.out.println(isAnagram(a, b));
        System.out.println(areAnagram(a.toCharArray(), b.toCharArray()));
        System.out.println(isPermuation(a.toCharArray(), b.toCharArray()));
    }

}