package CrackingTheCodingInterview.TechnicalQuestions;

public class FindDuplicates {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[] {1,2,1,2,3}));
    }

    public static int findDuplicates(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])-1] < 0) {
                return Math.abs(a[i]);
            } else {
                a[Math.abs(a[i])-1] *= -1;
            }
        }
        return -1;
    }
}