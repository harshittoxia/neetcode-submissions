class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int start = 0;
        int end = 1;
        int resp = 0;
        int count = 1;

        while (end < nums.length) {
            if (nums[end] - nums[start] == 0 || nums[end] - nums[start] == 1) {
                if (nums[end] - nums[start] == 1)
                    count++;
                resp = Math.max(resp, count);
            } else {
                count = 1;
            }
            start++;
            end++;
        }
        resp = Math.max(resp, count);
        return resp;
    }
}
