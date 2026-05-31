class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenstack = new Stack<>();
        int result = 0;

        for(int i = 0; i < tokens.length; i++){
                if(tokens[i].equals("+")){
                    int num1 = tokenstack.pop();
                    int num2 = tokenstack.pop();

                    tokenstack.push(num1 + num2);
                }else if(tokens[i].equals("-")){
                    int num1 = tokenstack.pop();
                    int num2 = tokenstack.pop();
                    tokenstack.push(num2 - num1);
                }else if(tokens[i].equals("*")){
                    int num1 = tokenstack.pop();
                    int num2 = tokenstack.pop();
                    tokenstack.push(num1 * num2);
                }else if(tokens[i].equals("/")){
                    int num1 = tokenstack.pop();
                    int num2 = tokenstack.pop();
                    tokenstack.push(num2 / num1);
                }else{
                    tokenstack.push(Integer.parseInt(tokens[i]));
                }
        }
        return tokenstack.pop();
    }
}
