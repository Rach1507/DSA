import java.util.Arrays;

public class productOfArr {
      public int[] productExceptSelf(int[] nums) {
        
        // brute force
        int ans[] = new int[nums.length];
        int productOfAlltoLeft[] = new int[nums.length];
        int productOfAlltoRight[] = new int[nums.length];
        int nonZeroProductToLeft[] = new int[nums.length];

        int productOfall = 1;

        Arrays.fill(productOfAlltoLeft , 1);
        Arrays.fill(productOfAlltoRight , 1);
        Arrays.fill(nonZeroProductToLeft , 1);


        // i can cache the product of all to right 

        for(int i =0 ;i < nums.length; i++){
            productOfall *= nums[i]; 
        }

        for(int i =0;i < nums.length; i++){
            if(i > 0) 
            productOfAlltoLeft[i] = productOfAlltoLeft[i-1] * nums[i-1];

            // if(i > 0 && nums[i-1] != 0 && nums[i] != 0)
            // nonZeroProductToLeft[i] = nonZeroProductToLeft[i-1] * nums[i-1];

            // if(nums[i] == 0)
            //      productOfAlltoRight[i] = productOfall / nonZeroProductToLeft[i];

            //  else if (productOfAlltoLeft[i] == 0){
            //     productOfAlltoRight[i] = productOfall / nonZeroProductToLeft[i];
            //     productOfAlltoRight[i] /= nums[i];
            // }
            // else{
                productOfAlltoRight[i] = productOfall / productOfAlltoLeft[i];
                productOfAlltoRight[i] /= nums[i];
            // }
          
        }

        

        for(int i =0 ;i < productOfAlltoLeft.length; i++){
          System.out.print(productOfAlltoLeft[i]+ " "); 
        }

System.out.println();
        for(int i =0 ;i < productOfAlltoRight.length; i++){
          System.out.print(productOfAlltoRight[i]+ " "); 
        }

        ans[0] = productOfAlltoRight[0];
        ans[nums.length- 1] = productOfAlltoLeft[nums.length- 1];

        for(int i =1 ;i < nums.length- 1; i++){
           ans[i] = productOfAlltoLeft[i] * productOfAlltoRight[i];
        }

        return ans;

    }
}


