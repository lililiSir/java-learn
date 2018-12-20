package cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description:
 * @Modified By:
 */
public abstract class Observer {

    protected Subject _subject;

    public Observer(Subject subject) {
        this._subject = subject;
        this._subject.addObserver(this);
    }

    public abstract void update();

}
