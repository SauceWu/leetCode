import org.junit.Test;


public class LRUCacheTest {
    @Test
    public void lRUCacheTest() {
        LRUCache lruCache = new LRUCache(10);
        for (int i = 0; i < 10; i++) {
            lruCache.put(i, i);
        }
        System.out.println(lruCache.get(5));
    }

}