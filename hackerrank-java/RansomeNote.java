public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {

        List<String> magazineList = new ArrayList<>(Arrays.asList(magazine));
    
        for (String word : note) {
            if (!magazineList.remove(word)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static void checkMagazine2(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            int count = magazineMap.getOrDefault(magazine[i], 0)+1;
            magazineMap.put(magazine[i], count);
        }
        for (int i = 0; i < note.length; i++) {
            if (!magazineMap.containsKey(note[i]) || magazineMap.get(note[i]) <= 0) {
                System.out.println("No");
                return;
            } else {
                magazineMap.put(note[i], magazineMap.get(note[i])-1);
            }
        }
        System.out.println("Yes");

    }
}

