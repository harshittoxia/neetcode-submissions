class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resp = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int start = i + 1;
            int end = nums.length - 1;

            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0){
                    resp.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    start++;
                    end--;

                    while(start < nums.length - 1 && nums[start] == nums[start - 1]){
                        start++;
                    }
                }else if(sum > 0){
                    end--;
                }else if(sum < 0) {
                    start++;
                }
            }
        }
        return resp;
    }
}
