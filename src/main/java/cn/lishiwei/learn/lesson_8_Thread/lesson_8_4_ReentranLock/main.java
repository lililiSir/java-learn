package cn.lishiwei.learn.lesson_8_Thread.lesson_8_4_ReentranLock;

import cn.lishiwei.learn.lesson_8_Thread.lesson_8_3_volatile.ReadWriteLockTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/8/6.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) throws InterruptedException {


//        List<ReentrantLockThread> list = new ArrayList<>();
//
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
//
//        for (int i = 0; i < 10; i++) {
//            executor.execute(new ReentrantLockThread(i, false));
//        }
//        executor.shutdown();

        ReadWriteLockTest readWriteLockTest=new ReadWriteLockTest();

        readWriteLockTest.testLockDowngrading();

    }

}
