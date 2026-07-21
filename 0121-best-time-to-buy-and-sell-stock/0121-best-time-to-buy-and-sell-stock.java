class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            int sell = prices[i]-buy;
            if(sell > profit){
                profit = sell;
            }
        }
        return profit;   
    }
}