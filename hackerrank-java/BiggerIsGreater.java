public class BiggerIsGreater {
    static String biggerIsGreater(String w) {
        List<String> list = new ArrayList<>();
        permutation("", w, list);
        System.out.println(list);
        String largest = w;
        String secondLargest = w;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(w) > 0 && list.get(i).compareTo(secondLargest) > 0) {
                largest = list.get(i);
            }
            if (largest.compareTo(list.get(i)) > 0 && secondLargest.compareTo(w) > 0) {
                secondLargest = list.get(i);
            }
        }
        return largest.equals(w) ? "no answer" : secondLargest;
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
}