public class GameStop {
    public static void main(String[] args) {
        
    }

    static int howManyGames(int p, int d, int m, int s) {
        int games = 0;
        while (s >= 0) {
            if (s - p > 0) {
                games++;
                s -= p;
                if (p - d < m){
                    p = m;
                } else {
                    p -= d;
                }
            } else {
                return games;
            }
        }
        return games;
    }
}