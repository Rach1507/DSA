import java.util.HashMap;

public class ransomNote {

    /*
     * loop through magazine
     * 
     * currCount = magazineMap.containsKey(letter) ? get(letter) || 0
     * magazineMap.put("letter", currCount +1 );
     * 
     * 
     * loop through ransom
     * 
     * see if map.has(letterInRansom)
     * // it has - reduce the count of letter , if 1 was prev count , remove it ,
     * move index to next letter ,
     * // no - return false
     * 
     * 
     */

    public boolean canConstructHashTable(String ransomNote, String magazine) {

        HashMap<Character, Integer> magazineMap = new HashMap<>();
        int currCount = 0;
        Character letter;

        for (int i = 0; i < magazine.length(); i++) {

            letter = magazine.charAt(i);
            if (magazineMap.containsKey(letter)) {
                currCount = magazineMap.get(letter);
                magazineMap.put(letter, currCount + 1);
            } else {
                magazineMap.put(letter, 1);
            }
        }

        Character ransomLetter;

        for (int i = 0; i < ransomNote.length(); i++) {
            ransomLetter = ransomNote.charAt(i);
            if (magazineMap.containsKey(ransomLetter)) {
                currCount = magazineMap.get(ransomLetter);
                if (currCount > 1)
                    magazineMap.put(ransomLetter, currCount - 1);
                else
                    magazineMap.remove(ransomLetter);
            } else {
                return false;
            }
        }
        return true;
    }



    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }

}
