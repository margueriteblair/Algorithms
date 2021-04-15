public class ExtraCandies {
    public static void main(String[] args) {
        
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arrList = new ArrayList<>();
        
        for (int i = 0; i < candies.length; i++) {
            boolean temp = false;
            int curr = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (curr < candies[j]) {
                    arrList.add(false);
                    temp = true;
                    break;
                }
            }
            if (temp != true) {
                arrList.add(true);
            }
        }

        return arrList;
    }
}