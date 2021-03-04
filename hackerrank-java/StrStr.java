public class StrStr {
    public static void main(String[] args) {
        
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = i; j <= haystack.length(); j++) {
                if (haystack.substring(i, j).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                try {
                    if (haystack.substring(i, needle.length()+i).equals(needle)) {
                    return i;
                }
                } catch (Exception ex) {
                        return -1;
                    }

            }
        }
        return -1;
    }
}