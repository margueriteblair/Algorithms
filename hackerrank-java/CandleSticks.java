public class CandleSticks {
    public static void main(String[] args) {
        
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int global = 0;
        for (int i = 0; i < candles.size(); i++) {
            int local = 0;
            for (int j = 0; j < candles.size(); j++) {
                if (candles.get(j) == candles.get(i)) {
                    local++;
                    if (local > global) global = local;
                }
            }
        }
        return global;
    }
}