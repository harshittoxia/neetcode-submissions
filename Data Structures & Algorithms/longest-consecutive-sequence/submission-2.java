class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length - 1 -i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        int longestConsec = 1;
        int count = 1;  
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else if(nums[i] == nums[i-1]+1){
                   count++;
            }else{
                count = 1;
            }

            longestConsec = Math.max(longestConsec,count);
        }
        return longestConsec;
    }
}
