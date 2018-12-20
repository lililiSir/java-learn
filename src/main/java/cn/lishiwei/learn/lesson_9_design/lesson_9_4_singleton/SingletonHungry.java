package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description: 饿汉式，饿汉式是最常用的方式，利用的是类加载机制里面，初始化时对静态变量的初始化，从而在类加载时，就将实例初始化完成，实现了线程安全
 * @Modified By:
 */
public class SingletonHungry {

    public static SingletonHungry instance = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return instance;
    }
}
