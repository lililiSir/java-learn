package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class SingletonInnerClass {

    public static class SingletonInnerClassHolder {
        public static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static final SingletonInnerClass getInstance() {
        return SingletonInnerClassHolder.instance;
    }
}
