public class CandleSticks {
    public static void main(String[] args) {
        
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int global = 0;
        int local = 0;
        Collections.sort(candles);
        for (int i = 0; i < candles.size()-1; i++) {
            if (candles.get(i) == candles.get(i+1)) {
                local++;
                if (local > global) global = local;
            } else {
                local = 0;
            }
        }
        return global+1;
    }
}