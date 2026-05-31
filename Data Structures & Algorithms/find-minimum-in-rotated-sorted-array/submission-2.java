class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int smallestNum = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start)/2;
            smallestNum = Math.min(smallestNum, nums[mid]);

            if(nums[start] > nums[end] && nums[mid] >= nums[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return smallestNum;
    }
}
