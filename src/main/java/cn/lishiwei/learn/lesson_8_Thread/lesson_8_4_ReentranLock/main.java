package cn.lishiwei.learn.lesson_8_Thread.lesson_8_4_ReentranLock;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/8/6.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) throws InterruptedException {
        //
        // ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();
        //
        // readWriteLockTest.testLockDowngrading();

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        Lock lock = reentrantReadWriteLock.readLock();

        Condition condition = lock.newCondition();

    }

}
