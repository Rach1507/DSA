
public class rotateClockwise {
    public void rotate(long arr[], long n)
    {   int len = (int)n;
        long last = arr[len-1];
        for (int i =len-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=last;
        
        
    }

    public static void leftRotate(int[] arr, int n, int d) {
        
        reverse(arr,0,d);
        reverse(arr, d, n);
        reverse(arr, 0, n);
        
}

    private static void reverse(int[] arr, int i, int d) {

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
