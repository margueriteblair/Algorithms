import java.util.Arrays;

public class LeastInterval {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;
        int[] charMap = new int[26];
        for (char c : tasks) {
            charMap[c-'A']++;
        }
        Arrays.sort(charMap);
        int max = charMap[25]-1;
        int idleSlots = max * n;
        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(charMap[i], max);
        }
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}

