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

    static long minTime(long[] machines, long goal) {
        Arrays.sort(machines);
        long max = machines[machines.length - 1];
        long minDays = 0;
        long maxDays = max*goal;
        long result = -1;
        while (minDays < maxDays) {
            long mid = (minDays + maxDays) / 2;
            long unit = 0;
            for (long machine : machines) {
                unit += mid / machine;
            }
            if (unit < goal) {
                minDays = mid+1;
            } else {
                result = mid;
                maxDays = mid;
            }
        }
        return result;
    }
}