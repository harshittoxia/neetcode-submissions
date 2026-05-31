class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int response = Integer.MIN_VALUE;

        int end = 0;
        int currentSum = 0;
        while(end < nums.length){
            currentSum += nums[end];
            response = Math.max(response, currentSum);

            if(currentSum <= 0){
                currentSum = 0;
            }
            end++;
        }
        return response;
    }
}
