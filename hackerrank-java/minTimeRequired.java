public class minTimeRequired {
    public static void main(String[] args) {
        
    }

    static long minTime(long[] machines, long goal) {
        long itemCount = 0;
        long day = 1;
        // Arrays.sort(machines);
        while (itemCount < goal) {
            for (int i = 0; i < machines.length; i++) {
                if (machines[i] > day) {
                    continue;
                }
                if (day % machines[i] == 0) {
                    itemCount++;
            }
        }
        day++;
        }
        return day-1;
    }
}