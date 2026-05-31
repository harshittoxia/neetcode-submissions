class Solution {
    public boolean hasDuplicate(int[] nums) {
        int start = 0;
        int end = 1;

        while(start < nums.length - 1){
            if(nums[start] == nums[end]){
                return true;
            }else{
                if(end == nums.length - 1) {
                    start++;
                    end = start + 1;
                }else{
                    end++;
                }
            }
        }

        return false;
    }
}