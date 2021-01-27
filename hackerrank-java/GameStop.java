public class GameStop {
    public static void main(String[] args) {
        
    }

    static int howManyGames(int p, int d, int m, int s) {
        int games = 0;
        while (s >= p) {
            games++;
            s -= p;
            p = Math.max(p - d, m);
    }
    return games;
    }
}