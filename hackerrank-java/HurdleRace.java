

public class HurdleRace {
    public static void main(String[] args) {
        
    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
            int diff = 0;
            for (int i = 0; i < height.size(); i++) {
                if (height.get(i) - k > diff) {
                    diff = height.get(i) - k;
                }
            }
            
            return diff;
    
        }

        public static int hurdleRace2(int k, List<Integer> height) {
            // Write your code here
                return Math.max(0, Collections.max(height)-k);
            }
}