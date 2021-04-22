import java.util.Arrays;

// Input : 1, 2, 3, 4, 5
// Output :5, 4, 3, 2, 1

// Input :  10, 20, 30, 40
// Output : 40, 30, 20, 10

public class arrayRev { 

    static void printArr(int b[]){

        System.out.println();
        for (int i =0;i<b.length;i++)
                System.out.println(b[i]);
    }    
    
  
    static void reverse1(int a[], int n) 
    {   //out of place reverse
        int b[] = new int[n];
        for (int i =0,j=n-1;i<n;j--,i++)
           b[i] = a[j];
        
        printArr(b);
    }

    static void revInPlace(int a[],int n)
    {   
        //in-place reversal
        for (int i=0,j=n-1;i<=n/2;j--,i++)
        {
            int temp = a[i];
            a[i] =a[j];
            a[j]=temp;
        }

    printArr(a);
    }
    // It takes linear time
    // Collections.reverse takes a mutable list and reverses its order. It takes linear time. It has to.

    // Guava's Lists.reverse returns a view of the list that is reversed. It returns in constant time, but you'll pay the (small) overhead of the view for each operation.
    
    static void revCollections(int a[]){
        java.util.Collections.reverse(Arrays.asList(a));
        printArr(a);
    }

public static void main(String[] args) 
    {

    int a [] = {1, 2, 3, 4, 5,7};
    reverse1(a, a.length);
    revInPlace(a, a.length);
    revCollections(a);
    }

}