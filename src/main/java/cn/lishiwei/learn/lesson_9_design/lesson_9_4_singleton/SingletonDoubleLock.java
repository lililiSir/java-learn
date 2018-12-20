package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class SingletonDoubleLock {


    public static volatile SingletonDoubleLock instance;


    public static SingletonDoubleLock getInstance() {

        if (instance == null) {
            synchronized (SingletonDoubleLock.class) {
                if (instance == null) {
                    instance = new SingletonDoubleLock();
                }
            }
        }

        return instance;
    }
}
