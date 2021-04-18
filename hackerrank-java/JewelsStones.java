public class JewelsStones {
    public static void main(String[] args) {
        
    }

    public int numJewelsInStones(String jewels, String stones) {
        //you want to know how many of the stones you have are also jewels
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}