public class MakeAnagram {
    public static void main(String[] args) {
        
    }

    public static int solution(String a, String b) {
        int[] freq = new int[26];
        a.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        b.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        
        return Arrays.stream(freq).map(Math::abs).sum();
    }

    static int makeAnagram(String a, String b) {
        Map<Character, Integer> count = new HashMap<>();
        for( char ch: a.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct + 1));
        }
        
        for( char ch: b.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct - 1));
        }
        
        List<Integer> values = new ArrayList<>( count.values() );
        int total = 0;
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        return total;
    }

}


