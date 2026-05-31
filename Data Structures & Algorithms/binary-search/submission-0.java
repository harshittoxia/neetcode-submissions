class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return binarySearch(nums, left, right, target);
    }

    public int binarySearch(int[] nums, int l, int r, int t){

        while(l <= r){
            int medium = l + ((r - l) / 2);

            if(nums[medium] == t){
                return medium;
            }else if(nums[medium] < t){
                l = medium + 1;
            }else{
                r = medium - 1;
            }
        }

        return -1;
    }
}
