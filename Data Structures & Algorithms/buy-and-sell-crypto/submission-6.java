class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 1;
        int maxProfitStk = 0;

        while(start < prices.length - 1){
            int current = prices[end] - prices[start];
            maxProfitStk = Math.max(maxProfitStk, current);
            end++;

            if(end > prices.length  - 1){
                start++;
                end = start + 1;
            }
        }
        return maxProfitStk;
    }
}
