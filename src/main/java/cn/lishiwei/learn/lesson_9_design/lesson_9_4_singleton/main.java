package cn.lishiwei.learn.lesson_9_design.lesson_9_4_singleton;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.get();
    }

}
