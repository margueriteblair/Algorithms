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

}
}