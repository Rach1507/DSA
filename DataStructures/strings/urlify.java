
class urlify {
    // public static String URLify(String str, int k) {
    // int n = str.length();
    // // ArrayList<Character> strArr = new ArrayList
    // char[] strArr = new char[n];
    // char[] arr = str.toCharArray();
    // int j = 0;
    // for (int i = 0; i < k; i++) {

    // if (arr[i] == ' ') {
    // // { strArr.add('%');
    // // strArr.add('2');
    // // strArr.add('0');

    // strArr[j++] = '%';
    // strArr[j++] = '2';
    // strArr[j++] = '0';
    // } else {
    // strArr[j] = arr[i];
    // j++;
    // }
    // // strArr.add(arr[i]);

    // }

    // // return Arrays.toString(strArr);
    // return String.valueOf(strArr);
    // }








    private static final int MAX = 100;





    public static void main(String[] args) {
        // System.out.println(URLify("Mr John Smith ", 13));

        System.out.println(urlInPlace("Mr John Smith    ", 13));
    }

    private static String urlInPlace(String string, int i) {

        int n = string.length();
        char[] strArr = new char[n];
        int k = 0;
        for (int j = 0; j < i; j++) {

            if (string.charAt(j) == ' ') {
                strArr[k++] = '%';
                strArr[k++] = '2';
                strArr[k++] = '0';
            } else {
                strArr[k] = string.charAt(j);
                k++;
            }

        }

        return String.valueOf(strArr);

    }





static char[] replaceSpaces(char[] str)
    {
 
        // count spaces and find current length
        int space_count = 0, i = 0;
        for (i = 0; i < str.length; i++)
            if (str[i] == ' ')
                space_count++;
 
        // count spaces and find current length
        while (str[i - 1] == ' ')
        {
            space_count--;
            i--;
        }
 
        // Find new length.
        int new_length = i + space_count * 2;
 
        // New length must be smaller than length
        // of string provided.
        if (new_length > MAX)
            return str;
 
        // Start filling character from end
        int index = new_length - 1;
 
        char[] old_str = str;
        str = new char[new_length];
 
        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--)
        {
 
            // inserts %20 in place of space
            if (old_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }
             
            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
        return str;
    }
}
// We have implemented this problem using character arrays, because Java strings are immutable. If we used
// strings directly, the function would have to return a new copy of the string, but it would allow us to implement
// this in just one pass.
// }









// int n = string.length();
// String[] str = new String[n];

// for(int j = 0;j<i;j++)
// {

// if (string.charAt(j) == ' ') {
// str[j] = new String("%20");
// // System.out.print(str[j]);
// }

// else {
// str[j] = new String(String.valueOf(string.charAt(j)));
// // System.out.print(str[j]);
// }

// }

// // for (int j = 0; j < i; j++) {
// // if(str[j].isBlank())
// // {
// // str[j] ="%20";
// // }

// // }

// // return new StringBuilder().toString();
// return str.toString();
// }}