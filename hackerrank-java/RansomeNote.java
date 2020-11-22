public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        Arrays.sort(note);
        Arrays.sort(magazine);
        List<String> magazineList = new ArrayList<>(Arrays.asList(magazine));
    
        for (String word : note) {
            if (!magazineList.remove(word)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

