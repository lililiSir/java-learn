package cn.lishiwei.learn.lesson_8_Thread.lesson_8_7_deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-06.
 * @Description: 死锁的演示和jConsole的使用
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object1) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (object2) {

                    }

                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object2) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (object1) {

                    }

                }
            }
        });

        thread1.start();
        thread2.start();
    }


}
