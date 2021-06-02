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
                    if (gene.substring(i, j).length() < lengthSmallest && matchesChars(gene.substring(i, j), subMap)) {
                        lengthSmallest = gene.substring(i, j).length();
                    }
                }
            }
        
            System.out.println(subMap);
            System.out.println(maxChar + " " + steady);
            return lengthSmallest;
        }
        
        public static boolean matchesChars(String test, Map<Character, Integer> map) {
            for (int i = 0; i < test.length(); i++) {
                if (map.containsKey(test.charAt(i))) {
                    map.put(test.charAt(i), map.get(test.charAt(i))-1);
                    if (map.get(test.charAt(i))-1 == 0) {
                    map.remove(test.charAt(i));
                    }
                }
            }
            
            if (map.isEmpty()) {
                return true;
            }
            return false;
        }
}