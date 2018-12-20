package cn.lishiwei.learn.lesson_9_design.lesson_9_7_2_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description:
 * @Modified By:
 */
public class BinaryObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("二进制" + arg);
    }
}
