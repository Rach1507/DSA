package strings;

public class revLine {


  
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
    String[] words = st.split("\\s");

    words = RevString(words, words.length);

    System.out.println(String.join(" ", words));

  }


 
    // StringBuffer reverse() Method in Java with Examples
    
    // The Java.lang.StringBuffer.reverse() is an inbuilt method which is used to reverse the characters in the StringBuffer.
    //  The method causes this character sequence to be replaced by the reverse of the sequence.







    // Syntax :
    
    // public StringBuffer reverse()
    // Parameters : The method does not take any parameter .
    
    // Return Value : The method returns the StringBuffer after reversing the characters.












    // Examples :
    
    // Input: StringBuffer = GeeksforGeeks
    // Output = !skeegrofskeeG
    
    // Input: StringBuffer = Hello World
    // Output = !dlroW olleH










    // Below programs illustrate the java.lang.StringBuffer.reverse() method:
    // Program 1:
    
    
    // Java praogram to illustrate the 
    // java.lang.StringBuffer.reverse() 
  







    // public class Test { 
      
    //     public static void main(String args[]) 
    //     { 
    //         StringBuffer sbf = new StringBuffer("Geeksforgeeks!"); 
    //         System.out.println("String buffer = " + sbf); 
              
    //         // Here it reverses the string buffer 
    //         sbf.reverse(); 
    //         System.out.println("String buffer after reversing = " + sbf); 
    //     } 
    // } 





    // Output:
    
    // String buffer = Geeksforgeeks!
    // String buffer after reversing = !skeegrofskeeG




    // Program 2:
    






    
    // Java praogram to illustrate the 
    // java.lang.StringBuffer.reverse() 







    // import java.lang.*; 
      
    // public class Test { 
      
    //     public static void main(String args[]) 
    //     { 
    //         StringBuffer sbf = new StringBuffer("1 2 3 4 5 6 7 8 9 10"); 
    //         System.out.println("String buffer  = " + sbf); 
      
    //         // Here it reverses the string buffer 
    //         sbf.reverse(); 
    //         System.out.println("String buffer after reversing = " + sbf); 
    //     } 
    // } 







    // Output:
    // String buffer  = 1 2 3 4 5 6 7 8 9 10
    // String buffer after reversing = 01 9 8 7 6 5 4 3 2 1











 // approach 2 (no extra space)


 // Reverse the string
 public static String[] RevString(String[] s, int l) {

  // Check if number of words is even
  if (l % 2 == 0) {

    // Find the middle word
    int j = l / 2;

    // Starting from the middle
    // start swapping words at
    // jth position and l-1-j position
    while (j <= l - 1) {
      String temp;
      temp = s[l - j - 1];
      s[l - j - 1] = s[j];
      s[j] = temp;
      j += 1;
    }
  }

    // Check if number of words is odd
    else {

      // Find the middle word
      int j = (l / 2) + 1;

      // Starting from the middle start
      // swapping the words at jth
      // position and l-1-j position
      while (j <= l - 1) {
        String temp;
        temp = s[l - j - 1];
        s[l - j - 1] = s[j];
        s[j] = temp;
        j += 1;
      }
    }

    // Return the reversed sentence
    return s;
  }

}





































// String words[] = s.split(" ");

// for (int j = 0; j < words.length; j++)
// if( (words[j].isBlank()) && (words[j+1].isBlank()) )
// continue;
// else
// System.out.println(words[j]);

// String rev;
// for (int i = (words.length - 1); i >= 0; i--) {
// if(words[i].isBlank())continue;
// // System.out.print(words[i] + " ");

// rev +=words[i] +" ";

// }
// if(words[0].isBlank())

// return rev.substring(0,rev.length());

// else return rev+words[0];

// }

// System.out.println();

// }

// String rev="";

// for (int i = (words.length - 1); i >= 0; i--) {

// rev +=words[i] +" ";

// }

// if(rev.startsWith(" ") || rev.endsWith(" ")){

// }

// public class revLine{

// // Reverse the letters of the word
// static void reverse(char str[], int start, int end)
// {

// char temp;

// while (start <= end)
// {
// // Swapping the first and last character
// temp = str[start];
// str[start] = str[end];
// str[end] = temp;
// start++;
// end--;
// }
// }
// // Function to reverse words
// static char[] reverseWords(char []s)
// {
// // Reversing individual words as explained in the first step

// int start = 0;
// for (int end = 0; end < s.length; end++)
// {

// if (s[end] == ' ')
// {
// reverse(s, start, end);
// start = end + 1;
// }
// }

// // Reverse the last word
// reverse(s, start, s.length - 1);

// // Reverse the entire String
// reverse(s, 0, s.length - 1);
// return s;
// }

// public static void main(String[] args)
// {
// String s = "i like this program very much ";

// char []p = reverseWords(s.toCharArray());
// System.out.print(p);
// }

// }

// public class revLine {

// public static void main(String[] args) {
// String words[] = "i like this program very much".split(" ");

// // String ans = "";

// // for (int i = s.length - 1; i >= 0; i--)
// // {
// // ans += s[i] + " ";
// // }

// // System.out.println("Reversed String:");
// // System.out.println(ans.substring(0, ans.length() - 1));
// }
// }
