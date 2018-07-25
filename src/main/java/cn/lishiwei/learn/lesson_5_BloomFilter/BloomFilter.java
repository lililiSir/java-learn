package cn.lishiwei.learn.lesson_5_BloomFilter;

import java.util.BitSet;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/23.
 * @Description:
 * @Modified By:
 */
public class BloomFilter {

    private static final int DEFAULT_SIZE = 2 << 24;

    private static final int[] seeds = new int[]{5, 7, 11, 13, 31, 37, 61};

    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash[] func = new SimpleHash[seeds.length];

    public BloomFilter() {
        for (int i = 0; i < seeds.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
        }
    }


    public void addValue(String value) {
        for (SimpleHash f : func) {
            bits.set(f.hash(value), true);
        }
    }

    public boolean contains(String value) {

        if (value == null) {
            return false;
        }

        boolean ret = true;

        for (SimpleHash f : func) {
            ret = ret && bits.get(f.hash(value));
        }

        return ret;
    }


}

class SimpleHash {

    private int cap;

    private int seed;

    public SimpleHash(int cap, int seed) {
        this.cap = cap;
        this.seed = seed;
    }

    public int hash(String value) {

        int result = 0;

        int len = value.length();

        for (int i = 0; i < len; i++) {
            result = seed * result + value.charAt(i);
        }
        //计算位置
        return (cap - 1) & result;
    }
}
