class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] response = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int product = 1;
            for(int j = 0 ; j < nums.length ; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            response[i] = product;
        }

        return response;
    }
}  
