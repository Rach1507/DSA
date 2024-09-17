import java.util.ArrayList;
import java.util.List;

public class Solution {

    // - why i concatinate - i will have no way to decode 
    // storing word count - not an option ( contraints on problem)
    // append to the string - a number ( word length count )- used to decode 
    // problem is if word starts with a num : ex - 3a - 23a - which makes it wrong 
    // so add a delimiter beside of 2#3a - so wont be problem 

    public String encodeMySolution(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        StringBuilder encodedWord = new StringBuilder();

        for(String str: strs){
            encodedWord.setLength(0); // Clear previous content
            encodedWord.append(str.length()).append('#').append(str);
            encodedStr.append(encodedWord);
        }
        // System.out.println(encodedStr);
        return encodedStr.toString();
    }

    public String encodeOptimal(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decodeMySolution(String str) {
        List<String> wordList = new ArrayList<>(); 
        StringBuilder count = new StringBuilder();
        char ch ;
        int index = 0;

        while(index < str.length()){
            ch = str.charAt(index);
            if(ch == '#'){
                int len = Integer.parseInt(count.toString());
                wordList.add(str.substring(index+1, index+len+1));
                index += len+1;
                count.setLength(0);
            }
            else{ count.append(ch);index++;}
        }

        return wordList;
    }

    public List<String> decodeOptimal(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }

}
 
