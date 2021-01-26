public class PickingNumbers {
    public static void main(String[] args) {
        
    }

    public static int pickingNumbers(List<Integer> a) {
        int len = 1;
        int max;
        int min;
        for (int i = 0; i < a.size()-1; i++) {
            max = a.get(i);
            min = a.get(i);
            int tempLen = 1;
            for (int j = i+1; j < a.size(); j++) {
                if (Math.abs(max - min) > 1) {
                    break;
                }
                if (a.get(j) == a.get(i)) {
                    tempLen++;
                    
                }
                if (a.get(j) == a.get(i)+1) {
                    max = a.get(j);
                    if (Math.abs(max - min) <= 1) {
                        tempLen++;
                    }
                }
                if (a.get(j) == a.get(i)-1) {
                    min = a.get(j);
                    if (Math.abs(max - min) <= 1) {
                        tempLen++;
                    }
                }
                if (tempLen > len) len = tempLen;
            }
        }
        
        return len;
    }
}