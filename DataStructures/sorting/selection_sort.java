
import java.util.Random;

public class selection_sort {
 
// Time Complexity:

//     O(n2) as there are two nested loops.
// Auxiliary Space: O(1) 
// it never makes more than O(n) swaps and can be useful when memory write is a costly operation. 
//
// Stability : The default implementation is not stable. However it can be made stable. Please see stable selection sort for details.
// In Place : Yes, it does not require extra space.
    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {

            // find min
            // swap a[i] & a[min]

            int min = i;

            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
    // public void sel_sort(int arr[], int n){

    // for (int i=0;i<n;i++){

    // int min=0;
    // int j;

    // for(j=i+1;j<n;j++)
    // { min=i;
    // if(arr[j]<arr[min]) min=j;

    // int temp = arr[min];
    // arr[min] = arr[i];
    // arr[i] = temp;
    // }

    // }

    // }

    public static void main(String[] args) {
        selection_sort sc = new selection_sort();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] + " ");
        }
        sc.selectionSort(arr, arr.length);
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
    }

}
