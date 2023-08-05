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