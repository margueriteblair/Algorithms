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
} 
