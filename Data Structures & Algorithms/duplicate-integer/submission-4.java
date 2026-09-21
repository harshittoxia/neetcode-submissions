class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(arrList.contains(nums[i])){
                return true;
            }else{
                arrList.add(nums[i]);
            }
        }
        return false;
    }
}