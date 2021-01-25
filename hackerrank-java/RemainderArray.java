public class RemainderArray {
    public static void main(String[] args) {
        
    }

    public static int nonDivisibleSubset(int k, List<Integer> S) {
        int[] remainderArr = new int[k];
        for (Integer each : S) {
            remainderArr[each % k]++;
        }
        int zeroRemainder = remainderArr[0];
        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet ++;
        }

        return maxNumberOfDivisibleSet;
    }
}