package cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description:
 * @Modified By:
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("十进制" + super._subject.getState());
    }
}
