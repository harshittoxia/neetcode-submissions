class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while(nums.length - 1 > start){
            if(nums[start] + nums[end] == target){
                return new int[]{start,end};
            }else{
                if(end == nums.length - 1){
                    start++;
                    end = start + 1;
                }else{
                    end++;
                }
            }
        }
        return new int[2];
    }
}
