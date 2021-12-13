import java.util.*;

public class canConstruct {

    public static boolean wordBreak(String s, List<String> wordDict) {

        HashMap<String, Boolean> memo = new HashMap<>();
        return wordBreak(s, wordDict, memo);

    }

    public static boolean wordBreak(String s, List<String> wordDict, HashMap<String, Boolean> memo) {

        if (s.isBlank())
            return true;

        if (memo.containsKey(s))
            return memo.get(s);

        for (String word : wordDict) {

            if (s.startsWith(word)) {

                boolean res = wordBreak(s.substring(word.length()), wordDict);

                if (res) {
                    memo.put(s, true);
                    return true;
                }

            }
        }
        memo.put(s, false);

        return memo.get(s);
    }
    public static void main(String[] args) {
     
        String [] arr = new String[4];
        arr[0]="a";
        arr[1]="bcd";
        arr[2]="de";
        arr[3]="e";

        List<String> ar = Arrays.asList(arr);
        System.out.println(wordBreak("abcde",ar));
     

    }
}
