public class binStrings {
    static int countOfSubstringWithKOnes(String s, int k, int m) {


        int n = s.length();
        int[] arr = new int[n];
        int l = 0;
        for (int i = l; i < n; i++)
            arr[i] = s.charAt(i);

        // 100111010

        int count = 0, cnt0 = 0;

        for (int i = 0; i < m; i++)
            if (arr[i] == '1')
                cnt0++;

        if (cnt0 == k)
            count++;

        for (int i = m; i < n; i++) {
            if (arr[i] == '1' ) cnt0++;
            if (arr[l] == '1' ) {
                cnt0--;
            }
            if (cnt0 == k)
                count++;
            l++;
        }

      
        return count;
    }

    // Driver code to test above methods
    static public void main(String[] args) {
        String s = "100111010";
  

        System.out.println(countOfSubstringWithKOnes(s, 3, 3));
    }
}
