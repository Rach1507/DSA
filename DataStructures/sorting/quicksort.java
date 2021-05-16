import java.util.Arrays;

public class quicksort {
    
    
        // Function to sort an array using quick sort algorithm.
        static void quickSort(int arr[], int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex);
                quickSort(arr, pivotIndex + 1, high);

            }
        }

        static int partition(int arr[], int low, int high) {
            

            int rand_indx = (new java.util.Random().nextInt(high-low))+low;
            
            int i = low + 1;

            arr = swapArr(arr, rand_indx, low);
            int piv = arr[low];
            for (int j = low + 1; j <= high; j++)
                if (arr[j] < piv) {
                    arr = swapArr(arr, j, i);
                    i += 1;
                }

            arr = swapArr(arr, i - 1, low);

            return i - 1;
            // your code here
        }

        static int[] swapArr(int arr[], int rnd_indx, int low)

        {
            int temp = arr[rnd_indx];
            arr[rnd_indx] = arr[low];
            arr[low] = temp;
            return arr;
        }

        public static void main(String[] args) {
            int arr[]={1,7,6,5,4};
           quickSort(arr,0,4);
           for (int i = 0; i < 5; i++)
               System.out.print(arr[i] + " ");
        }

    
}
