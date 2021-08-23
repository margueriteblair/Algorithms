public class NewYearsChaos {
    public static void main(String[] args) {
        
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
            int bribes = 0;
            for (int i = 0; i < q.size(); i++) {
                if (q.get(i) != (i+1)) {
                    int j = i;
                    while (j != q.get(i)-1) {
                        j++;
                    }
                    if ((j - i) > 2) {
                        System.out.println("Too Chaotic");
                        return;
                    } else {
                        bribes += (j-i);
                    }
                }
            }
        }
}