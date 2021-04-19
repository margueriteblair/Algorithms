public class PartitioningDecimals {
    public static void main(String[] args) {
        
    }

    public int minPartitions(String n) {
        String elevens = "";
        for (int i = 0; i < n.length(); i++) {
            elevens += "1";
        }
        
        Long nInt = Long.valueOf(n);
        int eleventInt = Integer.valueOf(elevens);
        
        return nInt % eleventInt == 0 ? (int) nInt / eleventInt : (int) nInt / eleventInt + 1;
    }
}