public class StrStr {
    public static void main(String[] args) {
        
    }

    public int strStr(String haystack, String needle) {
        if (needle == "") return 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < haystack.length(); j++) {
                if (haystack.substring(i, j).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}