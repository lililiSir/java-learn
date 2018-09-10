package cn.lishiwei.learn.lesson_8_Thread.lesson_8_4_ReentranLock;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockThread implements Runnable {

    private volatile boolean cacheValid;

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    private Lock readLock = reentrantReadWriteLock.readLock();

    private Lock writeLock = reentrantReadWriteLock.writeLock();

    private  int currentValue = 0;

    private int num;


    public ReentrantLockThread(int num, boolean isUpdated) {
        this.num = num;
    }

    @Override
    public void run() {
        cacheValid = false;
        Thread.currentThread().setName("test-thread-" + num);
        processCachedData2(num);
    }

    /**
     * 降级锁
     *
     * @param num
     */
    private void processCachedData(int num) {
        HashMap<String, String> map = new HashMap<>();
        //获得读锁
        reentrantReadWriteLock.readLock().lock();
        if (!cacheValid) {
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();

            try {
                if (!cacheValid) {
                    currentValue = num;
                    //修改数据
                    cacheValid = true;
                }
                reentrantReadWriteLock.readLock().lock();
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        try {
            System.out.println(Thread.currentThread().getName() + ";获得的值为:" + currentValue);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }

    }

    /**
     * 降级锁
     *
     * @param num
     */
    private void processCachedData2(int num) {

        //获得读锁
        readLock.lock();
        if(!cacheValid){
            readLock.unlock();
            writeLock.lock();
            try{
                if(!cacheValid){
                    System.out.println(Thread.currentThread().getName() + " has updated!");
                    currentValue = num;
                    cacheValid = true;
                }
            }finally {
                writeLock.unlock();
            }
        }

        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() + ";获得的值为:" + currentValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (reentrantReadWriteLock.getReadHoldCount() > 0) {
                readLock.unlock();
            }
        }
    }

}
