public class HighestAlt {
    public static void main(String[] args) {
        
    }

    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
        int runningSum = 0;
        for (int i = 0; i < gain.length; i++) {
            runningSum += gain[i];
            highestAlt = Math.max(highestAlt, runningSum);
        }
        return highestAlt;
    }
}