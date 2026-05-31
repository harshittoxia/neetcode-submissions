class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int maxProfit = 0;

        int l = 0;
        int r = 1;

        while(r < prices.length){
            if(prices[r] > prices[l]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }else{
                l = r;
            }

            r++;
        }

        return maxProfit;
    }
}
