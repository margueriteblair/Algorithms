public class BoneTrousel {
    public static void main(String[] args) {
        
    }

    public static List<Long> bonetrousle(long n, long k, int b) {
        // Write your code here
            List<Long> list = new ArrayList<>();
            for (int i = 1; i <= b; i++) {
                list.add(i);
            }
            int sumB = 0;
            for (int i : list) {
                sumB += i;
            }
            if (sumB > n) {
                List<Long> arrList = new ArrayList<>();
                arrList.add(-1L);
                return arrList;
            } else if (sumB == n) {
                return list;
            } else {
                
            }//notes
        }
    }
}