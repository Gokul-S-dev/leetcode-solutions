class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    int min;
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            minSt.push(value);
            min = value;
        }else if (value <= min){
            min = value;
            minSt.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        if(st.peek()==min){
            minSt.pop();
            if(!minSt.isEmpty()){
                min = minSt.peek();
            }
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */