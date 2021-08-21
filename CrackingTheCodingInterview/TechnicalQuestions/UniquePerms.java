public class UniquePerms {
    public static void main(String[] args) {
        generatePermutations("ABC", 0, 3);
    }

    static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch; //the swap
        return String.valueOf(b);
    }

    static void generatePermutations(String str, int start, int end) {
        if (start == end-1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutations(str, start+1, end);
                str = swapString(str, start, i);
            }
        }
    }
}