public class BobbysChocolate {
    public static void main(String[] args) {
        
    }

    static int chocolateFeast(int n, int c, int m) {
        int initialBars = n / c;
        int totalChocolate = initialBars;
        while (initialBars - m >= 0) {
            initialBars -= m;
            totalChocolate++;
            initialBars++;
        }
        return totalChocolate;

    }
}