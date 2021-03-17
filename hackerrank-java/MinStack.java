class MinStack {
    List<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        this.list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
        if (x < min) {
            min = x;
        }
    }
    
    public void pop() {
        if (list.size()-1 == min) {
            list = 
        }
        list.remove(list.size()-1);
        
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}