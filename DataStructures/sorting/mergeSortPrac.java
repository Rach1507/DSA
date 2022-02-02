public class mergeSortPrac{
    
    public static void merge(int arr[], int low, int m, int end)
{
    int n1 = m - low + 1;
    int n2 = end - m + 1;
    
   
    
    int l[] = new int[n1];
    int r[] = new int[n2];
    
    for(int i =0;i<n1;i++)
    l[i]=arr[i+low];
    
     for(int i =0;i<n2;i++)
    r[i]=arr[i+m];
        
    System.out.println("L and R");

    printArray(l);
    printArray(r);


        
   int left  =0,right =0, arr_index= low;
   
   
    while(left < n1 && right < n2){
        
        if(l[left] < r[right])  arr[arr_index++] = l[left++];
        
        else
        arr[arr_index++] = r[right++];
        
        
    }
    
    
     while (left < n1) {
        arr[arr_index] = l[left++];
        arr_index++;
        
    }

  
    while (right < n2) {
        arr[arr_index] = r[right++];
       arr_index++;
    }
  
    System.out.println("Partially sorted");
    printArray(arr);

}
static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    public static void mergeSort(int arr[], int l, int r)
{
    // if(l<r) 
    //middle
    //spilt
    //split right
    //merge 
    
    
    
    
    if (l < r) {
      
        int mid = (l + r) / 2;

       
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
     }
}


public static void main(String args[])
    {
        int ar1[] = { 10,12 };
        int ar2[] = { 5,18,20 ,16};
        System.out.println("Given Array");
        printArray(ar1);
 
       
        mergeSort(ar1, 0, ar1.length - 1);
        mergeSort(ar2, 0, ar2.length - 1);
        System.out.println("\nSorted array");
        printArray(ar1);
        printArray(ar2);



    }
}