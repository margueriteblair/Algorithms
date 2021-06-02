public class BearGenes {
    public static void main(String[] args) {
        
    }

    public static int steadyGene(String gene) {
        // Write your code here
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < gene.length(); i++) {
                int count = map.getOrDefault(gene.charAt(i), 0) + 1;
                map.put(gene.charAt(i), count);
            }
            //go through hashmap and find all the chars over steady
            //then find the shortest substring that has all of these
            int maxChar = 0;
            int steady = gene.length()/4;
            Map<Character, Integer> subMap = new HashMap<>();
            for (Map.Entry<Character, Integer> set : map.entrySet()) {
                if (set.getValue() > steady) {
                    subMap.put(set.getKey(), set.getValue()-steady);
                    maxChar += (set.getValue() - steady);
                }
            }
        
            int lengthSmallest = gene.length();
            for (int i = 0; i < gene.length()-maxChar; i++) {
                for (int j = i+maxChar; j <= gene.length(); j++) {
                    Map<Character, Integer> subMapCopy = subMap;
                    System.out.println(subMap);
                    System.out.println(subMapCopy);
                    if (gene.substring(i, j).length() < lengthSmallest && matchesChars(gene.substring(i, j), subMapCopy)) {
                        lengthSmallest = gene.substring(i, j).length();
                    }
                }
            }
        
            return lengthSmallest;
        }
        
        public static boolean matchesChars(String test, Map<Character, Integer> map) {
            System.out.println(test);
            Map<Character, Integer> mapCopy = new HashMap<>();
            for (Map.Entry<Character, Integer> set : map.entrySet()) {
                mapCopy.put(set.getKey(), set.getValue());
            }
            
            for (int i = 0; i < test.length(); i++) {
                if (mapCopy.containsKey(test.charAt(i))) {
                    mapCopy.put(test.charAt(i), mapCopy.get(test.charAt(i))-1);
                    if (mapCopy.get(test.charAt(i)) == 0) {
                    mapCopy.remove(test.charAt(i));
                    }
                }
            }
            
            if (mapCopy.isEmpty()) {
                return true;
            }
            return false;
        }
}