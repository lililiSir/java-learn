package cn.lishiwei.learn.lesson_10_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-11-12.
 * @Description:
 * @Modified By:
 */
public class LRULinkedHashMap extends LinkedHashMap {

    private int maxSize;

    public LRULinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
        this.maxSize = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size() >= this.maxSize + 1;
    }
}
