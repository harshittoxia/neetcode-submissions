class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] resp = new int[nums.length - k + 1];

        for(int i = 0; i <= nums.length - k; i++){
            int maxNum = nums[i];
            for(int j = i; j < k+i; j++){
                maxNum = Math.max(maxNum, nums[j]);
            }
            resp[i] = maxNum;
        }


        return resp;
    }
}
