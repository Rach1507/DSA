import java.util.Arrays;

public class merge {
    public static void mergeSort(int [] arr ,int[] temp ,int lo, int hi){
        int middle = (lo+hi)/2;
       
        if(lo<=hi){
        mergeSort(arr, temp, 0, middle);
        mergeSort(arr, temp,  middle+1,hi);
        Merge(arr,temp,lo,middle,hi);
    }}
    private static void Merge(int[] arr, int[] temp, int lo,int mid, int hi) {

            int i =lo;
            int j =mid+1;
            int k =lo;

            // Arrays.copyOf(arr, temp);
            for(k=lo;k<=hi;k++)
                    {
                        if (arr[i] > arr[j])   {
                            temp[k]=arr[j];
                            j++;
                        } 
                        if (arr[i] <= arr[j])  {  
                            temp[k]=arr[i];
                            i++;
                        }

                        if (i>mid) {
                            temp[k]=arr[j];
                            j++;

                        }
                        
                        if (j>hi) {
                            temp[k]=arr[i];
                            i++;
                            
                        }
                    
                    }

            for(int h=0;h<temp.length;h++){
                arr[h]=temp[h];
            }


    }
    public static void main(String[] args) {
        int [] ar ={1,5,67,89,97,6,8,9};
        int n = ar.length;
        
        mergeSort(ar,new int[n],0,n);
        printArr(ar);
    }
    private static void printArr(int[] ar) {
        for(int i=0;i<ar.length;i++)
           {System.out.print(ar[i]+" ");
    }
    
}
}
