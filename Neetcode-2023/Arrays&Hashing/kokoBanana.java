public class kokoBanana {
    

    //brute force

    public int minEatingSpeed(int[] piles, int h) {

        

        int sum =0;
        int max = 0 ;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i] > max)max = piles[i];
            sum += piles[i];

        }

        int noOfHoursPassed = 0;
        // int k = 1 ;
        int k = sum/h; 

        int i = 0 ;

        int[] remainingPiles = piles.clone();

        if(piles.length == h)return max;


        while(1 <= k < max ){

            while(noOfHoursPassed <= h ){

                if(i >= piles.length){
                    return k;
                }

                remainingPiles[i] = remainingPiles[i] - k ;
                if(remainingPiles[i] <= 0){
                    i++;
                }
                
                noOfHoursPassed++;
            }
            noOfHoursPassed=0;
            k++;
            i=0;
            remainingPiles = piles.clone();

        }

    return max;
       
    }
}
