public class BitArray {
    public static void main(String[] args) {
        int[] arr= {1,0,1,0,1,0,0,1,1,0,0,0,1,0,1};
        int zeroCnt=0;
        for(int i :arr){
            
            if (i == 0)
                zeroCnt++;

        }
       
        int i=0;
        while(i<arr.length)

        {   if(i<zeroCnt)
                arr[i++]=0;

            else
                arr[i++]=1;   
        }

        for(int n :arr)
        System.out.print(n+"");

    }
}
