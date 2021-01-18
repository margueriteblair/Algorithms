public class PalindromeIndex {
    public static void main(String[] args) {
        
    }

    static int palindromeIndex(String s) {
        int i;
        int j;
        int a;
        int b;
        for (i=0, j=s.length()-1; i<s.length(); i++,j--){
            if (s.charAt(i)!=s.charAt(j)) break;
        }
        if (i>j) return -1;

        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        return i;
    }
}