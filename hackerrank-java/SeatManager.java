class SeatManager {
    int n;
    List<Integer> seats = new ArrayList<>();
    
    public SeatManager(int n) {
        this.n = n;
        for (int i = 1; i <= n; i++) {
            seats.add(i);
        }
    }
    
    public int reserve() {
        int lowest = seats.get(0);
        int index = 0;
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i) < lowest) {
                lowest = seats.get(i);
                index = i;
            }
        }
        seats.remove(index);
        return lowest;
    }
    
    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
        
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */