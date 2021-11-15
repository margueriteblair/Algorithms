public class SherlockAnagrams {
    public static void main(String[] args) {
        
    }

    static int sherlockAndAnagrams(String s) {
        int count = 0;
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                substringList.add(s.substring(i, j));
            }
        }
        System.out.println(substringList);
        return 0;

    }
}