class MyQueue {
    Stack<Integer> frontToBack = new Stack<>();
    Stack<Integer> backToFront = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        backToFront.push(x);
    }
    
    public int pop() {
        return frontToBack.pop();
    }
    
    public int peek() {
        return frontToBack.pop();
    }
    
    public boolean empty() {
        if (frontToBack.isEmpty() || backToFront.isEmpty()) {
            return true;
        }
        return false;
    }
}