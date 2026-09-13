class MinStack {
    private Stack<Integer> stack ;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack= new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else if(minstack.peek()>=val){
            minstack.push(val);
        }else{minstack.push(minstack.peek());}
        return;
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
