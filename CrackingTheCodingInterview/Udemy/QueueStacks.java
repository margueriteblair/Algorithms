import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;
    int top , first;
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
        top = -1;
    }
    
    public void push(int x) {
        if(s1.isEmpty()) first = x;
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        int del = s2.pop();
        if(!s2.isEmpty()) top = s2.peek();
        return del;
    }
    
    public int peek() {
        if(s2.isEmpty()) return first;
        return top;
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

class MyQueue2 {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
        
    }
    
    public int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }
    
    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s2.isEmpty() && s1.isEmpty();
    }
}