public class ChocolateBarProblem {
    public static void main(String[] args) {
        
    }

    static int birthday(List<Integer> s, int d, int m) {
        int possibilities = 0;
        for (int i = 0; i < s.size()-m+1; i++) {
            System.out.println("hi");
            int sum = 0;
            for (int j = i; j < m+i; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                possibilities++;
            }
        }
        return possibilities;
    }
}