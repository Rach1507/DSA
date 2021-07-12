
class Solution

{
    static int bst[];
    static int i = 0;

    public static int[] sortedArrayToBST(int[] nums) {
        bst = new int[100];
System.out.println(i);
        ArrayToBST(nums, 0, nums.length - 1);
        return bst;

    }

    private static void ArrayToBST(int[] arr, int start, int end) {
        int median = (start + end) / 2;
        System.out.println(median);

        if (median == 0) {
            System.out.println(i + " " + bst[i]);
            bst[i++] = arr[median];
            return;
        }

        else if (median == 1 && median - start < 2) {
            bst[i++] = arr[median];
            System.out.println( i+" "+ bst[i]);
            bst[i++] = arr[median - 1];
            System.out.println(i + " " + bst[i]);
            bst[i++] = arr[median + 1];
            System.out.println(i + " " + bst[i]);

            return;
        } else {
            bst[i++] = arr[median];
            System.out.println(i + " " + bst[i]);
            ArrayToBST(arr, start, median - 1);
            ArrayToBST(arr, median + 1, arr.length);
            // if (end< start) {
            // return ;
            // }
            // int mid= (start+ end)/ 2;
            // bst[i++]=arr[mid];
            // bst[i++] = ArrayToBST(arr, start, mid - 1);
            // bst[i++]= ArrayToBST(arr, mid+ 1, end);
            // return ;

        }
    }

    public static void main(String[] args) {
        int []nums = {1, 2, 3, 4};
        sortedArrayToBST(nums);
    }
}