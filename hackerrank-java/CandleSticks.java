public class CandleSticks {
    public static void main(String[] args) {
        
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int total = 0;
        int max = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
            }
        }

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max) {
                total++;
            }
        }
        return total;
    }
}