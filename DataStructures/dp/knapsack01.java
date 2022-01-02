public class knapsack01 {

    public static int knapsack0_1(int[]wt,int[]val,int W) {
        
        int max_val =Integer.MIN_VALUE;


        for (int i = 0; i < val.length; i++) {
            
                int wgt = wt[i];
                int profit =val[i];
                for (int j = 0; j < val.length; j++) {
                    
                    if ( j!=i && (wgt + wt[j]) <= W ){
                        wgt += wt[j];
                        profit += val[j];
                    }
                    
                    if(wgt + wt[j] > W) 
                    // else
                    break;

                    
                }

                max_val =Math.max(max_val, profit);

        }

        return max_val;
    }

    public static void main(String[] args) {
        
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapsack0_1( wt, val, W));
    }
}
