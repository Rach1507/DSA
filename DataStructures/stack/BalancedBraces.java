import java.util.*;

// x == '(' || x == '[' || x == '{'

public class BalancedBraces {
    // TODO:use tokens

    static Character matchingBrace(Character ch) {

        if (ch == '(')
            return ')';
        if (ch == '[')
            return ']';
        else
            return '}';
    }

    static boolean isBalanced(String expr) {
        ArrayList<Character> OpenBraces = new ArrayList<>();

        OpenBraces.add('[');
        OpenBraces.add('{');
        OpenBraces.add('(');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (OpenBraces.contains(x)) {

                stack.push(x);
                continue;
            }

            else if (stack.isEmpty())
                return false;

            // char check;
            Character topBrace = stack.peek();
            Character closeBrace = matchingBrace(topBrace);

            if (x == closeBrace)
                stack.pop();

        }

        return (stack.isEmpty());

    }

    public static void main(String[] args) {
        String expr = "([{)()}][)";

        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

// char [] bracks ={'[','{','('};

// switch (x)
// {
// case ')':
// check = stack.pop();
// if (check == '{' || check == '[')
// return false;
// break;

// case '}':
// check = stack.pop();
// if (check == '(' || check == '[')
// return false;
// break;

// case ']':
// check = stack.pop();
// if (check == '(' || check == '{')
// return false;
// break;
// }
// static boolean isBalanced(String expr)
// {

// }

// System.out.println(Arrays.toString(array));

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> brac = new Stack<>();

        for (int i = 0; i < x.length(); i++) {

            Character ele = x.charAt(i);

            if (ele == '{' || ele == '(' || ele == '[')

                brac.push(ele);

            else {
                 if (brac.empty()) 
                     return false;

                Character pair = getValue(ele);

                // if (!brac.empty()) {
                    if (pair == brac.peek())
                        brac.pop();
                    else
                        return false;
                // } else
                //     return false;
            }

        }

        if (brac.empty())
            return true;

        return false;

        // add your code here
    }

    static Character getValue(Character ele) {
        if (ele == ']')
            return '[';
        if (ele == '}')
            return '{';
        if (ele == ')')
            return '(';
        return null;
    }
}
