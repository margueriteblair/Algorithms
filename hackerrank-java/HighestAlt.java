public class HighestAlt {
    public static void main(String[] args) {
        
    }

    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            highestAlt = Math.max(highestAlt, highestAlt+gain[i]);
        }
        return highestAlt;
    }
}