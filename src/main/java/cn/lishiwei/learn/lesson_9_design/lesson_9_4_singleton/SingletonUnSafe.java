package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description: 单例模式，有几种实现方式：懒汉式、饿汉式、双重锁、枚举、静态内部类
 * @Modified By: 懒汉式--懒汉式又分线程安全和线程不安全两种，下面是懒汉式的线程不安全的实现方式
 */
public class SingletonUnSafe {

    public static SingletonUnSafe instance;

    public static SingletonUnSafe getInstance() {

        if (instance == null) {
            instance = new SingletonUnSafe();
        }
        return instance;
    }
}
