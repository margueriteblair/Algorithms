public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxPrice = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (maxPrice < drives[j] + keyboards[i] && drives[j] + keyboards[i] <= b) {
                    maxPrice = drives[j] + keyboards[i];
                }
            }
        }
        return maxPrice;

    }