public class equilibrium {

    public static int equilibriumPoint(long arr[], int n) {
        
        
        // if(arr.length==1)   return arr[0];
        
        
        
        
        // long sumStart=0 ,sumEnd=0;
        // int i=0,j=n-1;
        // sumStart += arr[i++;
        //     sumEnd += arr[j--];
        // // for(int i =0,j=n-1;i+=,j--)
        // while(i>n-1 || j<0){
            
        //     sumStart += arr[i];
        //     sumEnd += arr[j];
            
            
        for(int i=0;i<n;i++)
        {
            if(isEqui(i,arr))
                return i+1;
            
        }
        return -1;
            
            
        }
        
        
        public static boolean isEqui(int i,long[] ar){
            if(ar.length==1)   return true;
            if(sum(ar,0,i-1) == sum(ar, i+1,ar.length-1))
                return true;
            return false;
            
            
        }


        private static long sum(long[] ar, int i, int j) {
            long sum =0;
            for(int k=i;k<=j;k++)
                sum+=ar[k];
            return sum;
        }

        public static void main(String[] args) {
            long []arr = {1,3,5,2,2};
            System.out.println(equilibriumPoint(arr, 5));
        }
    
}
