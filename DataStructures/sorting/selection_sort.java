
import java.util.Random;
public class selection_sort {
    //TODO make it generic


    public void sel_sort(int arr[], int n){

        for (int i=0;i<n;i++){

            int min=0;
            int j;

            for(j=i+1;j<n;j++)
               { min=i;
                 if(arr[j]<arr[min])  min=j;
          
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
               }

        }
       
    }


    public static void main(String[] args) {
        selection_sort sc=  new selection_sort();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
           { 
               arr[i]= new Random().nextInt(100);
                System.out.print(arr[i]+" ");
            }
             sc.sel_sort(arr, arr.length);
        System.out.println();
        for(int j=0;j<10;j++)
           { 
                System.out.print(arr[j]+" ");
            }
    }
    
}
