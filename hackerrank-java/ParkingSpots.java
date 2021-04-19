class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            this.big--;
            if (this.big < 0) {
                return false;
            }
        } else if (carType == 2) {
            this.medium--;
            if (this.medium < 0) {
                return false;
            }
        } else {
            this.small--;
            if (this.small < 0) {
                return false;
            }
        }
        return true;
    }
}