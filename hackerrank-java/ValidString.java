public class ValidString {
    public static void main(String[] args) {
        
    }

    public static String isValid(String s) {
        // Write your code here
            Map<Character, Integer> charMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                int count = charMap.getOrDefault(s.charAt(i), 0);
                charMap.put(s.charAt(i), count+1);
            }
            List<Integer> arr = new ArrayList<>();
            for (int val : charMap.values()) {
                arr.add(val);
            }
            Collections.sort(arr);
            if (arr.get(0).equals(arr.get(arr.size()-1))) {
                return "YES";
            } else if (arr.get(0).equals(arr.get(arr.size()-2)) && (arr.get(1)) == (arr.get(arr.size()-1))) {
                return "YES";
            } else if (arr.get(0).equals(1) && arr.get(1).equals(arr.get(arr.size()-1))) {
                return "YES";
            } else {
               return "NO"; 
            }
        }
}