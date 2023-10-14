public class buySellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0 , profit =0 , minSoFar = Integer.MAX_VALUE; 
     
         for (int i = 0; i < prices.length;i++){
             if(prices[i] < minSoFar) minSoFar = prices[i];
             profit = prices[i]- minSoFar;
             if(profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
    }

    //  public int maxProfit(int[] prices) {

    //     int maxProfit = 0 , profit =0 ;
        
    //     for (int i = 0; i < prices.length-1;i++){
    //         for(int j = i+1; j <prices.length;j++){
    //             profit = prices[j]- prices[i];
    //             if(profit > maxProfit) 
    //                 maxProfit = profit;
    //         }
    //     }

    //     return maxProfit;
    // }
}