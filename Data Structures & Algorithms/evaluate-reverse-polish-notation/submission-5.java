class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") 
                || tokens[i].equals("*") || tokens[i].equals("/")){
                int two = stack.pop();
                int one = stack.pop();

                if(tokens[i].equals("+")){
                    result = one + two;
                }else if(tokens[i].equals("-")){
                    result = one - two;
                }else if(tokens[i].equals("*")){
                    result = one * two;
                }else if(tokens[i].equals("/")){
                    result = one / two;
                }
                
                stack.push(result);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
