package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description: 懒汉式--线程安全，使用同步机制，但效率不高
 * @Modified By:
 */
public class SingletonSafe {

    public static SingletonSafe instance;

    public static synchronized SingletonSafe getInstance() {
        if (instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }
}
