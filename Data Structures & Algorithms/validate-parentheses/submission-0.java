class Solution {
    public boolean isValid(String s) {
        Stack<Character> chList = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                chList.add(c);
            }else{
                if(chList.isEmpty() || 
                (c == ')' && chList.pop() != '(') ||
                (c == '}' && chList.pop() != '{') ||
                (c == ']' && chList.pop() != '[')
                ){
                    return false;
                }
            }
        }

        return chList.isEmpty();
    }
}
