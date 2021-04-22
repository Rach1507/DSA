public class alternateChars {
    private static int cnt=0;

    static int alternatingCharacters(String s) {
        int cnt=0;
        StringBuilder sb= new StringBuilder(s);
        // System.out.println(sb.toString());
        for(int i=1;i<sb.length();i++)
            if (sb.charAt(i)==sb.charAt(i-1))
               { sb.deleteCharAt(i-1);
                 i--;
                 cnt++;
                }

        // System.out.println(sb.toString());}

        return cnt;


    }
public static void main(String[] args) {
//     String s=AAAA;
String s="BBBABBA";
// String s="ABABABAB";
// String s=BABABA;
// String s="AAABBB";
// String s=ABABABAB;
System.out.println(alternatingCharacters(s));

}    
}
