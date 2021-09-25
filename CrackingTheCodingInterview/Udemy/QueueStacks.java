class MyQueue {
    Stack<Integer> ordered = new Stack<>();
    Stack<Integer> reverse = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        ordered.push(x);

    }
    
    public int pop() {
        while (!ordered.isEmpty()) {
            reverse.push(ordered.pop());
        }
        return reverse.pop();
    }
    
    public int peek() {
        while (!ordered.isEmpty()) {
            reverse.push(ordered.pop());
        }
        return reverse.peek();
    }
    
    public boolean empty() {
        if (reverse.isEmpty()) {
            return true;
        }
        return false;
    }
}
