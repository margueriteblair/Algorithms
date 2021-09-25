class MyQueue {
    Stack<Integer> frontToBack = new Stack<>();
    Stack<Integer> backToFront = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        backToFront.push(x);
        while (!backToFront.isEmpty()) {
            frontToBack.push(backToFront.pop());
        }
    }
    
    public int pop() {
        return frontToBack.pop();
    }
    
    public int peek() {
        return frontToBack.peek();
    }
    
    public boolean empty() {
        if (frontToBack.isEmpty() || backToFront.isEmpty()) {
            return true;
        }
        return false;
    }
}