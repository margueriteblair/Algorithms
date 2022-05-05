import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastBricksInWall {
    public int leastBricks(List<List<Integer>> wall) {
        int untouched = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            //prefix sum issue
            int end = 0;
            for (int brick = 0; brick < row.size() - 1; brick++) {
                end += row.get(brick);
                map.put(end, map.getOrDefault(end, 0) + 1);
                untouched = Math.max(untouched, map.get(end));
            }
        }
        
        return wall.size() - untouched;
        //O(N)
        //O(N)
    }

    public int leastBricks(List<List<Integer>> wall) {
        int[] pos = new int[wall.size()];
        int c = 0, sum = 0, res = Integer.MAX_VALUE;
        for (int el : wall.get(0)) {
            sum += el;
        }
        
        while (sum != 0) {
            int count = 0;
            for (int i = 0; i < wall.size(); i++) {
                List<Integer> row = wall.get(i);
                if (row.get(pos[i]) != 0) {
                    count++;
                } else {
                    pos[i]++;
                }
                row.set(pos[i], row.get(pos[i]) - 1);
            }
            sum--;
            res = Math.min(res, count);
        }
        return res;
    }
} 
