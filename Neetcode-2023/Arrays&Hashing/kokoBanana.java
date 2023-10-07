public class kokoBanana {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;

        int noOfHoursPassed = 0;
        int max = 0,sum = 0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i] > max) max = piles[i];
            sum += piles[i];

        }
        int currSolution  = max;
        int high = max;
        if (piles.length == h) return max;

        int i =0;
        
        while(low<=high){

            int mid = (low+high)/2;

             while(noOfHoursPassed < h + 1 ){


                if(i >= piles.length && noOfHoursPassed <= h){

                    currSolution = mid;
                    high = mid-1;
                    noOfHoursPassed=0;
                    
                    break;
                }

                if(piles[i]< mid)noOfHoursPassed++;
                else{
                noOfHoursPassed += ( piles[i] / mid );
                if(piles[i] % mid > 0) noOfHoursPassed++;
                }
                i++;
            }

            if(noOfHoursPassed >= h && i <= piles.length){
                low = mid+1;
                high = currSolution;
                noOfHoursPassed=0;
            }

            i=0;
        }

        return currSolution;

    }
}


    //brute force

    // public int minEatingSpeed(int[] piles, int h) {

        

    //     int sum =0;
    //     int max = 0 ;
    //     for(int i=0;i<piles.length;i++)
    //     {
    //         if(piles[i] > max)max = piles[i];
    //         sum += piles[i];

    //     }

    //     int noOfHoursPassed = 0;
    //     // int k = 1 ;
    //     int k = sum/h; 

    //     int i = 0 ;

    //     int[] remainingPiles = piles.clone();

    //     if(piles.length == h)return max;


    //     while(1 <= k < max ){

    //         while(noOfHoursPassed <= h ){

    //             if(i >= piles.length){
    //                 return k;
    //             }

    //             remainingPiles[i] = remainingPiles[i] - k ;
    //             if(remainingPiles[i] <= 0){
    //                 i++;
    //             }
                
    //             noOfHoursPassed++;
    //         }
    //         noOfHoursPassed=0;
    //         k++;
    //         i=0;
    //         remainingPiles = piles.clone();

    //     }

    // return max;
       
    // }




