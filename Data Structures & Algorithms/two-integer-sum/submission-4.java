class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            int find = target - nums[i];
            if(map.containsKey(find)) {
                result[0]=map.get(find);
                result[1]=i;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
