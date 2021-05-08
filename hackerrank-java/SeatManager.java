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
        return seats.remove(0);
    }
    
    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
        Collections.sort(seats);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */