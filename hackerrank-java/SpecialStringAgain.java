public class SpecialStringAgain {
    public static void main(String[] args) {
        
    }

    static long substrCount(int n, String s) {
        int count = 0;
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                substringList.add(s.substring(i, j));
            }
        }
        for (int i = 0; i < substringList.size(); i++) {
            if (isSpecial(substringList.get(i)) == true) {
                count++;
            }
        }
        return count;
    }
    
    static boolean isSpecial(String sub) {
        char[] charArr = sub.toCharArray();
        Arrays.sort(charArr);
        if (sub.length() == 1) return true;
        if (charArr[0] == charArr[charArr.length-1]) return true;
        if (sub.length() % 2 == 1) {
            System.out.println(sub);
            if (sub.substring(0, (sub.length()/2)).equals(sub.substring(sub.length()/2+1))) {
                return true;
            }
        }
        return false;
    }
}