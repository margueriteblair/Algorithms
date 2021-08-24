public class NewYearsChaos {
    public static void main(String[] args) {
        
    }


    public static void minimumBribes(List<Integer> q) {
        // Write your code here
            int bribes = 0;
            for (int i = q.size()-1; i >= 0; i--) {
                if ((q.get(i) - (i+1)) > 2) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    bribes += (q.get(i) - (i+1));
                }
            }
            System.out.println(bribes);
        }
}