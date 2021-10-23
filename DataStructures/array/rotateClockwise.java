
public class rotateClockwise {
    public void rotate(long arr[], long n)
    {   int len = (int)n;
        long last = arr[len-1];
        for (int i =len-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=last;
        
        
    }

    public static void leftRotate(int[] arr, int n, int d) {
        
        reverse(arr,0,d); //34512
        reverse(arr, d, n);
        reverse(arr, 0, n);
        
}

    private static void reverse(int[] arr, int i, int d) {


//         Given an array, rotate the array by one position in clock-wise direction.
 

// Example 1:

// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4
        // int temp = arr[d-1];
        while(i<d)

        {
            int temp = arr[d-1];
            arr[d-1] = arr[i];
            arr[i]=temp;
            i++;
            d--;

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
   
        leftRotate(arr, arr.length, 2);
    }
}
