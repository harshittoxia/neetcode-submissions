class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start < end) {
            int find = numbers[end] + numbers[start];
            if(find > target){
                end--;
            }else if(find < target){
                start++;
            }else if(target == find){
                return new int[]{start+1, end+1};
            }
        }
        return new int[]{0,0};
    }
}
