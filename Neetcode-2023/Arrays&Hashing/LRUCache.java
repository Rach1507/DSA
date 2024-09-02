import java.util.HashMap;
import java.util.Map;

class LRUCache {
    public HashMap<Integer, Integer> cache;
    public HashMap<Integer, Integer> cacheCount;
    public int capacity;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.cacheCount = new HashMap<>();
        this.capacity = capacity;
    }

    private int getLeastRecentlyUsed() {
        int minCount = Integer.MAX_VALUE, LRUkey = 0;
        for (Map.Entry<Integer, Integer> mapEntry : cache.entrySet())
            if (mapEntry.getValue() <= minCount) {
                LRUkey = mapEntry.getKey();
            }
        return LRUkey;
    }

    private void removeFromCache(int key){
        cache.remove(key);
        cacheCount.remove(key);
    }

    private void removeLRU() {
        int lruKey = getLeastRecentlyUsed();
        removeFromCache(lruKey);
    }

    private void incrementReadCount(int key){
        int value = 0 ; 
        if(cacheCount.containsKey(key)) value = cacheCount.get(key);
        
        cacheCount.put(key , value+1);
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            incrementReadCount(key);
            return cache.get(key);
        } else
            return -1;

    }

    public void put(int key, int value) {
        if (cache.size() >= capacity) {
            removeLRU();
        }
        cache.put(key, value);
        incrementReadCount(key);
    }
}
