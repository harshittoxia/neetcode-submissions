class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 1;
        int maxProfitStk = 0;

        while(start < prices.length - 1){
            if(prices[start] > prices[end] && end < prices.length - 1) {
                start = end;
                end++;
            }
            int current = prices[end] - prices[start];
            maxProfitStk = Math.max(maxProfitStk, current);

            if(end < prices.length - 1) {
                end++;
            }else{
                start++;
                end = start+1;
            }
        }
        return maxProfitStk;
    }
}
