class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minstack.isEmpty() || minstack.peek() >= val){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int popval = stack.pop();
        if(popval == minstack.peek()) {
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
