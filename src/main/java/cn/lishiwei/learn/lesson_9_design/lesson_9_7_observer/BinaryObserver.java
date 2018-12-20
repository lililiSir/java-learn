package cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description: 观察者
 * @Modified By:
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("二进制" + super._subject.getState());
    }
}
