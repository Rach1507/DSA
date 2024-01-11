import java.util.ArrayList;

public class ValidPalindrome {

        public boolean isPalindrome(String s) {

            int start = 0, end = s.length() - 1;
            Character left = null;
            Character right = null;

            while (start < end) {
                left = s.charAt(start);
                right = s.charAt(end);
                if (!Character.isLetterOrDigit(left)) {
                    start++;
                    continue;
                }
                if (!Character.isLetterOrDigit(right)) {
                    end--;
                    continue;
                }
                // System.out.println("Comparing "+left +" and "+right);
                if (Character.toLowerCase(left) != Character.toLowerCase(right))
                    return false;

                start++;
                end--;
            }

            return true;
        }
    }


    //     public boolean isPalindrome(String s) {
    //     ArrayList<Character> chararr = new ArrayList<>();

    //     for(int i =0 ; i < s.length(); i++){
    //         if(Character.isLetterOrDigit(s.charAt(i))){ 
    //             chararr.add(Character.toLowerCase(s.charAt(i))); 
    //         }
    //     }
    //     int start = 0, end = chararr.size()-1;

    //     while(start <= end){
    //         if(chararr.get(start) != chararr.get(end))
    //             return false;
    //         start++;
    //         end--;
    //     }
    // return true;
    // }
// }
