import java.util.Arrays;

public class sortAr {
    public void sortArray(int ar1[], int ar2[],int m ,int n){


           int i=0;
            int j=0;
            while(i<m)
            if( (ar1[i]>ar2[j]) )
            {
                // System.out.println(ar1[i]+" ar2[j]"+ar2[j]+" m "+m+" n "+n+" i "+i+" j "+j);

            int temp = ar1[i];
            ar1[i] = ar2[j];
            ar2[j] = temp;

            i=i+1;
            j=0;
            Arrays.sort(ar1);
            // printArray(ar1);
        
            Arrays.sort(ar2);
            // printArray(ar2);
            }

    }

        // 10, 12  //5,12       //5,8

        //5,8,18   // 8,10,18       //10,12,18


        static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
       
    
    public static void main(String[] args) {
        sortAr sc=  new sortAr();
        


        int ar1[] = { 10,12 };
        int ar2[] = {5,8,16,18};


        sc.sortArray(ar1,ar2,ar1.length, ar2.length);
        
        printArray(ar1);
        printArray(ar2);

    }
}
