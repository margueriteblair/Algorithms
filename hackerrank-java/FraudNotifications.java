public class FraudNotifications {
    static int activityNotifications(int[] expenditure, int d) {
        int[] trail = new int[d];
        int notifications = 0;
        for (int i = 0; i < expenditure.length-d; i++) {
            int med = 0;
            for (int j = 0; j < d; j++) {
                trail[j] = expenditure[j+i];
            }
            Arrays.sort(trail);
            if (d % 2 == 1) {
                    med = trail[(trail.length/2)];
                } else {
                    med = (trail[trail.length/2] + trail[(trail.length/2)+1])/2;
                }
                if (expenditure[i+d] >= 2*med) {
                    notifications++;
                }
        }

        return notifications;
    }
}