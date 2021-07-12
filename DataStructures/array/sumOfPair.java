import java.util.Arrays;
import java.util.Random;

class sumOfPAir{


    //TODO 
    public static void main(String[] args) {
        int num= 50;
    int [] arr= new int[100];
    int n = 5;
    for(int i=0;i<10;i++)
    { 
        arr[i]= new Random().nextInt(100);
         System.out.print(arr[i]+" ");
    }
    int sum = 0;
    Arrays.sort(arr);
    int idx =Arrays.binarySearch(arr, num);

    int nearest_idx= bin_search(arr,num);
    
    if(idx >0) System.out.println(idx);
    else{
        for (int i=nearest_idx-1;i>0;i--)
        {
            for(int j= i-1;j>0;j--)
            {
                sum = arr[i] +arr[j];
                System.out.print(sum);
                if (sum == num)
                System.out.print( String.format("%s,%s", arr[j], arr[i])); 

            }
        }

    }


    }   static int bin_search(int arr[], int ele) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == ele)
                return mid;

            if (arr[mid] < ele)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return high;
    }

    }

