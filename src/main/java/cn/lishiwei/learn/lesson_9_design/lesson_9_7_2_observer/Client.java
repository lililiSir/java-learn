package cn.lishiwei.learn.lesson_9_design.lesson_9_7_2_observer;

import cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer.Observer;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description:
 * @Modified By:
 */
public class Client {


    public static void main(String[] args) {

        Subject subject = new Subject();

        java.util.Observer binaryObserver = new BinaryObserver();

        subject.addObserver(binaryObserver);

        subject.setState(10);

    }

}
