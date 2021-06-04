public class CountingMatches {
    public static void main(String[] args) {
        
    }

    public int numberOfMatches(int n) {
        int matches=0;
        int total=0;
        while(n>1){
            matches=n/2;
            n=n-matches;
            total+=matches;
        }
        return total;
        }
        public int numberOfMatches2(int n) {
            int matches = 0;
            while (n > 1) {
                if (n % 2 == 0) {
                    matches += (n/2);
                    n = n / 2;
                } else {
                    matches += (n-1/(2)+1);
                    n = (n-1/2)+1;
                }
            }
            return matches;
        }

}
