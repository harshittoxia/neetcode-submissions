class MinStack {
    List<Integer> datastructure;

    public MinStack() {
        datastructure = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        datastructure.add(val);
    }
    
    public void pop() {
        datastructure.remove(datastructure.size() - 1);
    }
    
    public int top() {
        return datastructure.get(datastructure.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(datastructure);
    }
}
