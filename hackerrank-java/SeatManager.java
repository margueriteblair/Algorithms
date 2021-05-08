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
        
    }
}