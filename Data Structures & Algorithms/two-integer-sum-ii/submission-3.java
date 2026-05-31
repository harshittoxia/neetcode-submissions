class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] response = new int[2];

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i!=j && numbers[i]+numbers[j] == target){
                    response[0] = j+1;
                    response[1] = i+1;
                }
            }
        }

        return response;
    }
}
