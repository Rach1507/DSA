public class peakEle {
    public static void main(String[] args) {
        int[] arr= {2,3,4,4,4,4,5,6,5};


        for (int i =0;i<arr.length;i++)
        {
            if(i==0)  
              if(arr[0]>arr[1]) 
                System.out.println(arr[0]);
            else if (i==arr.length-1) 
                if(arr[arr.length-1]>arr[arr.length-2]) 
                    System.out.println(arr[arr.length-1]);

            else if((arr[i]>arr[i-1] ) && (arr[i]>arr[i-1]))
            System.out.println(arr[i]);


        }
    }
}
