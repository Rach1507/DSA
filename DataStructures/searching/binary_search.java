
//works only on sorted elements...so list/collection must be sorted before 
public class binary_search {
   
    private static int recursive_binsearch(int[] arr,int ele,int low , int high) {
    //    int n=arr.length;
        
        int mid = (low+high)/2;

        if(ele==arr[mid])return mid;
        else if (ele >arr[mid]) recursive_binsearch(arr, ele, mid+1,high);
        else recursive_binsearch(arr, ele,low ,mid);
        return -1;
    }

    static int bin_search(int arr[], int ele) {
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

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println(bin_search(arr, 4));
    System.out.println(recursive_binsearch(arr,4,0,(arr.length-1)));
}


}
