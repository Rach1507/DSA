public class revWords {
   /**
 *                          Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

                          Example 1:

                          Input: s = "the sky is blue"
                          Output: "blue is sky the"
                          Example 2:

                          Input: s = "  hello world  "
                          Output: "world hello"
                          Explanation: Your reversed string should not contain leading or trailing spaces.
                          */




    public static String reverseWordsWithSpace(String s) {
  
      String words[] = s.split(" ");
  
      StringBuilder rev = new StringBuilder();
  
      for (int i = (words.length - 1); i >= 1; i--) {
        if (words[i].isBlank())
          continue;
  
        rev.append(words[i]);
        rev.append(" ");
        // +" ";
  
      }
      if (words[0].isBlank())
        return rev.deleteCharAt(rev.length() - 1).toString();
  
      else
        return rev.append(words[0]).toString();
  
        // Can you trim() instead of lines 41-45
        // but costs time 
  
        // return rev.toString().trim();
  
    }
  
    static String reverseWords(String S) {
      String sarr[] = S.split("[.]");
      StringBuilder word = new StringBuilder();
  
      for (int i = sarr.length - 1; i >= 0; i--) {
        word.append(sarr[i]);
        word.append(".");
      }
  
      return word.substring(0, word.length() - 1).toString();
  
    }
  
    public static void main(String[] args) {
  
      // approach 1
      String s = "i.like.this.program.very.much";
  
      System.out.println(reverseWords(s));
  
      // approach 2 (no extra space)
  
      String st = "getting good at coding ";
      
  
      String rev = reverseWordsWithSpace(st);
  
      System.out.println(rev);
  
    } 
}
