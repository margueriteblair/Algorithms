public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
            int t1 = 0;
            int t2 = 0;
            int t3 = 0;
            
            for (int i : h1) {
                t1 += i;
            }
            for (int i : h2) {
                t2 += i;
            }
            for (int i : h3) {
                t3 += i;
            }

            if (h1.size() == 0 || h2.size() == 0 || h3.size() == 0) {
                return 0;
            }
            
            if (t1 == t2 && t2 == t3) {
                return t1;
            } else {
                if (t1 > t2 && t1 > t3) {
                    h1.remove(0);
                    return equalStacks(h1, h2, h3);
                } else if (t2 > t1 && t2 > t3) {
                    h2.remove(0);
                    return equalStacks(h1, h2, h3);
                } else {
                    h3.remove(0);
                    return equalStacks(h1, h2, h3);
                }
            }
    
        }
}