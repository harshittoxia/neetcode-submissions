class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }

            if(currentChar == ')' || currentChar == ']' || currentChar == '}'){
                if(!stack.isEmpty()) {
                    char inChar = stack.peek();
                    if((currentChar == ')' && inChar == '(')
                        || (currentChar == '}' && inChar == '{')
                        || (currentChar == ']' && inChar == '[')){
                            stack.pop();
                    }else{
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
