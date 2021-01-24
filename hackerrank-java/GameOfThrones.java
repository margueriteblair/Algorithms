public class GameOfThrones {
    public static void main(String[] args) {
        gameOfThrones("aaabbbb");
    }

    static String gameOfThrones(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int val : map.values()) {
            list.add(val);
        }
        int oddCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) oddCount++;
            if (oddCount > 1) return "NO";
        }
        return "YES";
    }
}