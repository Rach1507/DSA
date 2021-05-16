public class rearrange {
    

    public static void main(String[] args) {
        int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        rearrangeArr(arr, 9);
        System.out.println();
        for (int i = 0; i < 9; i++)
            System.out.print(arr[i] + " ");

    }
            //myCode -0(n) space o(n) time


    // private static void rearrangeArr(int[] arr, int n) {

      
    //     int[] temp = new int[n];
    //     int start = 0, end = n - 1;
    //     // boolean isEven=false;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] >= 0)
    //             temp[start++] = arr[i];
    //         else
    //             temp[end--] = arr[i];

    //     }
    //     start = 0;
    //     end = n - 1;

    //     for (int i = 0; i < n; i++) {
    //         // {if (isEven)
    //         if (i % 2 == 0) {
    //             int next = temp[start];
    //             if (next < 0)

    //                 arr[i] = temp[end--];

    //             else {
    //                 arr[i] = next;
    //                 start++;
    //             }
    //         }

    //         else {
    //             int next = temp[end];
    //             if (next > 0)

    //                 arr[i] = temp[start++];

    //             else {
    //                 arr[i] = next;
    //                 end--;
    //             }

    //             // isEven=false;
    //         }
    //     }
        // code here
    // }



    private static void rearrangeArr(int[] arr, int n) {

        
}
}