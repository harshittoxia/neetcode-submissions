class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] resp = new int[temperatures.length];

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{temperatures[0], 0});

        for(int i = 1; i < temperatures.length; i++){
            int currentElement = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0] < currentElement){
                int index = stack.peek()[1];
                resp[index] = i - index;
                stack.pop();
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return resp;
    }
}
