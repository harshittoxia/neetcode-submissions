class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] response = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            for(int j = i + 1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    response[i] = j - i;
                    break;
                }else{
                    response[i] = 0;
                }
            }
        }

        return response;
    }
}
