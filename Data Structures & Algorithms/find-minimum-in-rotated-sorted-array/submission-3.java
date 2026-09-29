class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = (start + end) / 2;
            min = Math.min(min, nums[mid]);

            if(nums[start] > nums[end] && nums[mid] >= nums[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return min;
    }
}
