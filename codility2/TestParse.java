public class TestParse {
    public static void main(String[] args) {
        boolean verdict;
        try {
            String test = "R20";
            Integer result = Integer.valueOf(test);
            verdict = true;
        } catch (Exception ex) {
            verdict = false;
        }
        System.out.println(verdict);
    }
}