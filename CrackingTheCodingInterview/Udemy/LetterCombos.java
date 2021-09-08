package CrackingTheCodingInterview.Udemy;

public class LetterCombos {
    public static void main(String[] args) {
        
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        //now we have a hashmap of all char to int combos
        for (int i = 0; i < digits.length(); i++){
            
        }
    }
}