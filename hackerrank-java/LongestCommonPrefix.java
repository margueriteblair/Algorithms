public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        Arrays.sort(strs, new Comparator<String>() {
            
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > (o2.length())) {
                    return 1;
                } else if (o1.length() < (o2.length())) {
                    return -1;
                } else {
                    return 0;
                }
        }});
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix += c;
        }
        return prefix;
    }
}