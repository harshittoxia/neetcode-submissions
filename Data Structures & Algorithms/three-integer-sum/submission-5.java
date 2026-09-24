class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resp = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            List<Integer> sublist = new ArrayList<>();
            int start = i + 1;
            int end = nums.length - 1;

            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(start < end){
                int sum = nums[start] + nums[end] + nums[i];
                if(sum == 0){
                    resp.add(Arrays.asList(nums[start], nums[end], nums[i]));
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start - 1]){
                        start++;
                    }
                }else if(sum > 0){
                    end--;
                }else if(sum < 0){
                    start++;
                }
            }
        }
        return resp;
    }
}
