import java.util.ArrayList;

public class ValidPalindrome {
        public boolean isPalindrome(String s) {
        ArrayList<Character> chararr = new ArrayList<>();

        for(int i =0 ; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){ 
                chararr.add(Character.toLowerCase(s.charAt(i))); 
            }
        }
        int start = 0, end = chararr.size()-1;

        while(start <= end){
            if(chararr.get(start) != chararr.get(end))
                return false;
            start++;
            end--;
        }
    return true;
    }
}
