public class LuckBalance {
    public static void main(String[] args) {
        luckBalance(k, contests);
    }

    static int luckBalance(int k, int[][] contests) {
        int important = 0;
        int luckBalance = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                important++;
                list.add(contests[i][0]);
            } else {
                luckBalance += contests[i][0];
            }
        }
        Collections.sort(list);
        System.out.println(list);
        int ableToLose = important-k;
        System.out.println(ableToLose);
        for (int i = 0; i < ableToLose; i++) {
            luckBalance -= list.remove(0);
            //because we're removing each entry
        }
        
        for (int i = 0; i < list.size(); i++) {
            luckBalance += list.get(i);
        }
        return luckBalance;
    }
}