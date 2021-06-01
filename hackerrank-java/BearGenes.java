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
            
            System.out.println(map);
            int maxChar = 0;
            int steady = gene.length()/4;
            for (int i : map.values()) {
                if (i > maxChar) maxChar = i;
            }
            System.out.println(maxChar + " " + steady);
            return 1;
    
        }

        public boolean isEven(Map<Character, Integer> charMap, int steady) {
            for (int count : charMap.values()) {
                if (count != steady) {
                    return false;
                }
                
                return true;
            }
        }
}