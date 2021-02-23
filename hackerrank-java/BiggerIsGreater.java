public class BiggerIsGreater {
    static String biggerIsGreater(String w) {
        List<String> list = new ArrayList<>();
        permutation("", w, list);
        System.out.println(list);
        String largest = w;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(w) < 0) {
                largest = list.get(i);
            }
        }
        return largest == w ? "no answer" : largest;
        // return "no answer";
    }
    
    private static void permutation(String prefix, String str, List list) {
    int n = str.length();
    if (n == 0) list.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);
    }
}