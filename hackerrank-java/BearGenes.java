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
        
        
            System.out.println(subMap);
            System.out.println(maxChar + " " + steady);
            return 1;
        }
}