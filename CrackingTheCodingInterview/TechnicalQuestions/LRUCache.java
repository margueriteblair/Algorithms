import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private int capacity;
    private Map<Integer, Integer> cache;
    private int lru = Integer.MAX_VALUE;

    public LRUCache(int capacity) {
        //positive size capacity, do we need to check?
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (value < lru) {
            lru = key;
        }
        this.cache.put(key, value);
        if (this.cache.size() > capacity) {
            this.cache.remove(key);
        }
    }
}