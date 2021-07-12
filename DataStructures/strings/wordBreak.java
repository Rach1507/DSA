import java.util.ArrayList;
import java.util.HashMap;

public class wordBreak {

//         static HashMap<String, Integer> wordmap;

//         public static int wordbreak(String A, ArrayList<String> B) {
//             wordmap = new HashMap<>();

//             for (String str : B) {

//                 wordmap.computeIfAbsent(str, key -> 1);

//             }
// System.out.println("added hm");
//             return segmentWords(A, B);

//         }
//         public static int segmentWords(String A, ArrayList<String> B) {

//             // if (A.equals(" "))
//             if(A.isBlank())
//                 return 1;
//             // }
//             for (int j = 1; j <= A.length(); j++) {

//                 if (wordmap.containsKey(A.substring(0, j)))
//                     if (segmentWords(A.substring(j), B) == 1)
//                         return 1;
//             }

//             return 0;
//         }


        public static int wordbreak(String A, ArrayList<String> B) {

            if (A.isBlank())
                return 1;

            for (int j = 1; j <= A.length(); j++) {

                if (B.contains(A.substring(0, j)))
                    if (wordbreak(A.substring(j), B) == 1)
                        return 1;
            }

            return 0;
        }
        

        public static void main(String[] args) {
            ArrayList<String> B =new ArrayList<>();
            
            B.add("i");
            B.add("like");
            B.add("everyone");
            System.out.println(wordbreak("ilike", B));
        }

    
}
