import java.util.*;

public class allPerms {
    public static List<String> find_permutation(String S) {
        int n = S.length();

        return permute(S, 0, n - 1);

    }

    public static List<String> permute(String S, int l, int r) {

        
        LinkedList<String> allPerms = new LinkedList<>();

        for (int i = l; i < r; i++) {
            if (S.length() == 1)
                allPerms.add(S);

            else {
                S = fixLetter(S, l,i);
                permute(S, l + 1, r);
                S = fixLetter(S, l,i);

            }
        }

        return allPerms;

    }

    static String fixLetter(String S, int i, int l) {

        S = S.replace(S.charAt(i), S.charAt(l));
        return S;

    }
 
    


    public static void main(String[] args) {
System.out.println(find_permutation("ABC"));


    }


    // if (S.length() == 1)
    // {
    // allPerms.add(S);
    // return allPerms;
    // }

    // if (S.length() == 2) {
    // allPerms.add(S);
    // allPerms.add(new StringBuilder(S).reverse().toString());
    // return allPerms;
    // }

    // else
    // {
    // allPerms = find_perms(S.substring(0, S.length()-1));

}