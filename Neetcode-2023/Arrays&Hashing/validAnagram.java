import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {



        if(s.length()!= t.length()) return false;

        int charMap[]=new int[26];
        Arrays.fill(charMap , 0);

        for (char ch : s.toCharArray())
        {
            charMap[ch -'a']++;
        }
         for (char ch : t.toCharArray())
        {
            charMap[ch-'a']--;
        }

        for(int i=0;i<26;i++ ){
            if(charMap[i]!=0)return false;
        }

        return true;
    }
}

class SolutionWith26 {
    public boolean isAnagram(String s, String t) {

        // if(s.length() != t.length()) return false;
        
        // int[] charArr = new int[26];
        // Arrays.fill(charArr, 0);

        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // for(int i =0;i< sArr.length;i++){
        //     charArr[sArr[i]-'a']++;
        //     charArr[tArr[i]-'a']--;
        // }

        // for(int i =0;i< s.length();i++){
        //     charArr[s.charAt(i)-'a']++;
        //     charArr[t.charAt(i)-'a']--;
        // }

        // for (int n : charArr) if (n != 0) return false;

        // for(int j =0;j< charArr.length ; j++){
        //     if (charArr[j] != 0 )return false;
        // }

        return true;

    }
}