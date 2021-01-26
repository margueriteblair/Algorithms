public class MigratoryBirds {
    public static void main(String[] args) {
        
    }

    static int migratoryBirds(List<Integer> arr) {
        int[] ids = new int[5];
        int highestCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            ids[arr.get(i)-1]++;
        }
        
        int leader = 0;
        int most = ids[0];
        for (int i = 1; i < ids.length; i++) {
            if (ids[i] > most) {
                most = ids[i];
                leader = i;
            } else if (ids[i] == most) {
                leader = Math.min(leader, i);
            }
        }
        return leader+1;
    }
}