class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resp = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i]+nums[j] == target){
                        resp[0] = j;
                        resp[1] = i;
                    }
                }
            }
        }

        return resp;
    }
}
