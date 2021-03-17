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
        list.remove(list.size()-1);
        min = Integer.MAX_VALUE;
        for (Integer num : list) {
            if (num != min && num < min) {
                min = num;
            }
        }
        
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}