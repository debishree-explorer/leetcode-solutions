class Solution {
    public int maxProfit(int[] prices) {
        int least = prices[0];
        int maxProfit = 0;

        for(int i=1 ; i<prices.length ; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            int curProfit = prices[i]-least;
            if(curProfit > maxProfit)
            maxProfit = curProfit;
        }
        return maxProfit;
    }
}