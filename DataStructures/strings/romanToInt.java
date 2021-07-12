

public class romanToInt {


//my soln

public int romanToInteger(String str) {
    // code here
    int sum = 0;
    int n = str.length();
    for (int i = 0; i < n - 1; i++)

    {

        if (str.charAt(i) == 'I') {
            if (str.charAt(i + 1) == 'V' || str.charAt(i + 1) == 'L' || str.charAt(i + 1) == 'C'
                    || str.charAt(i + 1) == 'D' || str.charAt(i + 1) == 'M' || str.charAt(i + 1) == 'X')
                sum -= 1;
            else
                sum += 1;

        }
        if (str.charAt(i) == 'V')
            sum += 5;
        if (str.charAt(i) == 'X') {
            if (str.charAt(i + 1) == 'L' || str.charAt(i + 1) == 'C' || str.charAt(i + 1) == 'D'
                    || str.charAt(i + 1) == 'M')
                sum -= 10;
            else
                sum += 10;

        }
        if (str.charAt(i) == 'L') {

            if (str.charAt(i + 1) == 'C' || str.charAt(i + 1) == 'D' || str.charAt(i + 1) == 'M')
                sum -= 50;
            else
                sum += 50;
        }
        if (str.charAt(i) == 'C') {

            if (str.charAt(i + 1) == 'D' || str.charAt(i + 1) == 'M')
                sum -= 100;
            else
                sum += 100;
        }
        if (str.charAt(i) == 'D') {

            if (str.charAt(i + 1) == 'M')
                sum -= 500;
            else
                sum += 500;

        }
        if (str.charAt(i) == 'M')
            sum += 1000;
    }
    char last = str.charAt(n - 1);
    if (last == 'I')
        sum += 1;
    if (last == 'V')
        sum += 5;
    if (last == 'X')
        sum += 10;
    if (last == 'L')
        sum += 50;
    if (last == 'C')
        sum += 100;
    if (last == 'D')
        sum += 500;
    if (last == 'M')
        sum += 1000;

    return sum;
}





    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a
    // given romal numeral
    int romanToDecimal(String str) {
        // Initialize result
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                // Comparing both values
                if (s1 >= s2) {
                    // Value of current symbol
                    // is greater or equalto
                    // the next symbol
                    res = res + s1;
                } else {
                    // Value of current symbol is
                    // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }

    // Driver Code
    public static void main(String args[]) {
        romanToInt ob = new romanToInt();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToDecimal(str));
        System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToInteger(str));
    }
}
