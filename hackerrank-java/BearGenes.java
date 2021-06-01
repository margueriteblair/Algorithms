public class BearGenes {
    public static void main(String[] args) {
        
    }

    public static int steadyGene(String gene) {
        // Write your code here
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < gene.length(); i++) {
                int count = map.getOrDefault(s.charAt(i), 0) + 1;
                map.put(s.charAt(i), count);
            }
            
            System.out.println(map);
            return 1;
    
        }
}