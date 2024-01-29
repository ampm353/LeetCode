class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();

    }
    
    public void push(int x) {
        input.push(x);

    }
    
    public int pop() {
        checkAndCopy();
        return output.pop();
    }
    
    public int peek() {
        checkAndCopy();
        return output.peek();
    }
    
    public boolean empty() {
        
        return input.isEmpty() && output.isEmpty();
    }

    private void checkAndCopy(){
        if(!output.isEmpty()){
            return;
        }

        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */