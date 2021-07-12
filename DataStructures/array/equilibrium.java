public class equilibrium {
  // public static int equilibriumPoint(long arr[], int n) {
    

  public static long equilibriumPoint(long a[], int n) {
    if (n == 1)
      return a[0];

    for (int i = 0; i < n - 1; i++) {
      // long pivot = a[i];
      long sum1 = sum(a, 0, i-1);
      long sum2 = sum(a, i + 1, n - 1);
System.out.println(sum1+" "+sum2);
      if (sum1 == sum2)
        return i;

    }

    return -1;

  }

  private static long sum(long[] ar, int i, int j) {
    long sum = 0;
    for (int k = i; k <= j; k++)
      sum += ar[k];
    return sum;
  }

   public static void main(String[] args) {
            long []arr = {32, 41, 34 ,26, 34 ,30 ,10, 11, 23 ,20 ,10 ,12 ,25 ,5 ,7 ,41 ,7 ,43 ,25};
            System.out.println(equilibriumPoint(arr, 19));
        }
}


//     public static int equilibriumPoint(long arr[], int n) {
        
        
//         // if(arr.length==1)   return arr[0];
        
        
        
        
//         // long sumStart=0 ,sumEnd=0;
//         // int i=0,j=n-1;
//         // sumStart += arr[i++;
//         //     sumEnd += arr[j--];
//         // // for(int i =0,j=n-1;i+=,j--)
//         // while(i>n-1 || j<0){
            
//         //     sumStart += arr[i];
//         //     sumEnd += arr[j];
            
            
//         for(int i=0;i<n;i++)
//         {
//             if(isEqui(i,arr))
//                 return i+1;
            
//         }
//         return -1;
            
            
//         }
        
        
//         public static boolean isEqui(int i,long[] ar){
//             if(ar.length==1)   return true;
//             if(sum(ar,0,i-1) == sum(ar, i+1,ar.length-1))
//                 return true;
//             return false;
            
            
//         }


//         private static long sumArr(long[] ar, int i, int j) {
//             long sum =0;
//             for(int k=i;k<=j;k++)
//                 sum+=ar[k];
//             return sum;
//         }

//         public static long equilibriumP(long a[], int n) {

//         if(n==1)return a[0];

//         int mid = (0 + n) / 2;

//         if(n==2)
//         {

//             long sum1 = sum(a, 0, mid - 1);
//             long sum2 = sum(a, mid, n - 1);

//             if (sum1 == sum2)
//                 return -1;

//         }

//         while(mid<n&&mid>=0)
//         {

//             long sum1 = sum(a, 0, mid - 1);
//             long sum2 = sum(a, mid + 1, n - 1);

//             if (sum1 == sum2)
//                 return mid + 1;

//             else if (sum1 > sum2)

//                 mid = mid - 1;

//             else

//                 mid = mid - 1;

//         }

//         return-1;
//         }

//     public static long sum(long []a,int start, int end){
//     int n = a.length;
//     long sum  = 0;
  
//     // if(start > end) return a[end];
//     for(int i = start;i<=end;i++)
//     {
//         sum += a[i];
//     }
    
    
//     return sum;
// }

//         public static void main(String[] args) {
//             long []arr = {7, 29, 9, 10,42 ,10, 5 ,10, 8 ,37, 33 ,1 ,19 ,19, 2 ,35, 24, 37, 9, 11 ,20 ,12, 33 ,36 ,33, 30, 28 ,33, 26, 6, 32, 28, 5 ,4};
//             System.out.println(equilibriumP(arr, 34));
//         }
    
// }
// if(n==1)return a[0];

// int mid = (0 + n) / 2;

// if(n==2)
// {

//     long sum1 = sum(a, 0, mid - 1);
//     long sum2 = sum(a, mid, n - 1);

//     if (sum1 == sum2)
//         return -1;

// }

// while(mid<n&&mid>=0)
// {

//     long sum1 = sum(a, 0, mid - 1);
//     long sum2 = sum(a, mid + 1, n - 1);

//     if (sum1 == sum2)
//         return mid + 1;

//     else if (sum1 > sum2)

//         mid = mid - 1;

//     else

//         mid = mid - 1;

// }

// return-1;
// }

// public static long sum(long []a,int start, int end){
//     int n = a.length;
//     long sum  = 0;
  
//     // if(start > end) return a[end];
//     for(int i = start;i<=end;i++)
//     {
//         sum += a[i];
//     }
    
    
//     return sum;