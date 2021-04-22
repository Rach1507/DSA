
import java.util.Random;


public class insertion_sort {
    
    public void insert_sort(int arr[], int n){

        for (int i=1;i<n;i++){

           
            int j=i;
            while(j>0 && (arr[j]<arr[j-1])){

            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j=j-1;
            }

        }
       
    }
    public static void main(String[] args) {
        insertion_sort sc=  new insertion_sort();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
           { 
               arr[i]= new Random().nextInt(100);
                System.out.print(arr[i]+" ");
           }
             sc.insert_sort(arr, arr.length);
        System.out.println();
        for(int j=0;j<10;j++)
           { 
                System.out.print(arr[j]+" ");
           }
    }


    
}
