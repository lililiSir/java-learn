package cn.lishiwei.learn.lesson_10_LinkedHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-11-12.
 * @Description:
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        LRULinkedHashMap lruLinkedHashMap = new LRULinkedHashMap(3, 0.75f, true);

        lruLinkedHashMap.put("K1", "K1");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K2", "K2");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K3", "K3");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K4", "K4");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K2", "K2");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K3", "K3");
        System.out.println("currentLink:" + lruLinkedHashMap);
        lruLinkedHashMap.put("K5", "K5");
        System.out.println("currentLink:" + lruLinkedHashMap);

    }


}
