package OODesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpace> availableSpaces = new ArrayList<>();
    private List<ParkingSpace> fullSpaces = new ArrayList<>();

}

abstract class ParkingSpace {
    
}


class ParkingLotSign {

}

class HandiCappedParkingSpace extends ParkingSpace {

}

class RegularParkingSpace extends ParkingSpace {
    
}

class CompactParkingSpace extends ParkingSpace {
    
}