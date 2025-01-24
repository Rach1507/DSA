import java.util.Arrays;

public class kokoBanana {

    public int minEatingSpeedOptimal(int[] v, int h) {
        // Find max while avoiding separate method call and array traversal
        int high = v[0];
        for (int pile : v) {
            high = Math.max(high, pile);
        }
        
        int low = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential overflow
            
            // Calculate hours inline with early exit
            long totalH = 0;  // Use long to prevent overflow
            for (int pile : v) {
                totalH += (pile + mid - 1) / mid; // Avoid double conversion and Math.ceil
                if (totalH > h) {
                    break;  // Early exit if we exceed h
                }
            }
            
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

      public static int minEatingSpeed(int[] piles, int h) {

        // total in h = max is total/h = 27/8 = 3~4
        // we can choose k from 1 to n ( min ) - go from 1

        // if piles.length <= h - return max

        // sort
        // find mid , mid - 1 - try it out - if shes able to eat ,

        Arrays.sort(piles);
        // System.out.println(piles[0]);
        // if (piles.length <= h)
        //     return piles[piles.length - 1];

        int left = 1;
        int right = piles[piles.length - 1];

        System.out.println(left);
        System.out.println(right);

        while (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid " + mid + "ableToEat " + ableToEat(mid, piles, h));
            if (ableToEat(mid, piles, h)) {
                right = mid;  // try to find a smaller speed
            } else {
                left = mid + 1; // not able to eat k , so choose k >mid
            }
        }

        return left; 
    }


   public static boolean ableToEat(int k , int[] piles, int h){
        

       long hoursNeeded = 0;  // use long to prevent overflow
    
    for (int pile : piles) {
        // Calculate hours needed for current pile
        // Math.ceil(pile/k) = (pile + k - 1) / k
        hoursNeeded += Math.ceil(pile/k);
        
        // Early exit if hours exceeded
        if (hoursNeeded > h) {
            return false;
        }
    }
    
    return hoursNeeded <= h;

    }



    public int minEatingSpeedold(int[] piles, int h) {

        int low = 1;

        int noOfHoursPassed = 0;
        int max = 0, sum = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max)
                max = piles[i];
            sum += piles[i];

        }
        int currSolution = max;
        int high = max;
        if (piles.length == h)
            return max;

        int i = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            while (noOfHoursPassed < h + 1) {

                if (i >= piles.length && noOfHoursPassed <= h) {

                    currSolution = mid;
                    high = mid - 1;
                    noOfHoursPassed = 0;

                    break;
                }

                if (piles[i] < mid)
                    noOfHoursPassed++;
                else {
                    noOfHoursPassed += (piles[i] / mid);
                    if (piles[i] % mid > 0)
                        noOfHoursPassed++;
                }
                i++;
            }

            if (noOfHoursPassed >= h && i <= piles.length) {
                low = mid + 1;
                high = currSolution;
                noOfHoursPassed = 0;
            }

            i = 0;
        }

        return currSolution;

    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{13,6,7,11},8));
    }

}
































    // brute force

    // public int minEatingSpeed(int[] piles, int h) {

    // int sum =0;
    // int max = 0 ;
    // for(int i=0;i<piles.length;i++)
    // {
    // if(piles[i] > max)max = piles[i];
    // sum += piles[i];

    // }

    // int noOfHoursPassed = 0;
    // // int k = 1 ;
    // int k = sum/h;

    // int i = 0 ;

    // int[] remainingPiles = piles.clone();

    // if(piles.length == h)return max;

    // while(1 <= k < max ){

    // while(noOfHoursPassed <= h ){

    // if(i >= piles.length){
    // return k;
    // }

    // remainingPiles[i] = remainingPiles[i] - k ;
    // if(remainingPiles[i] <= 0){
    // i++;
    // }

    // noOfHoursPassed++;
    // }
    // noOfHoursPassed=0;
    // k++;
    // i=0;
    // remainingPiles = piles.clone();

    // }

    // return max;

    // }


