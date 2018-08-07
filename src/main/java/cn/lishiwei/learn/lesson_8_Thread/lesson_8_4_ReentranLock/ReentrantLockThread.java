package cn.lishiwei.learn.lesson_8_Thread.lesson_8_4_ReentranLock;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockThread implements Runnable {

    private volatile boolean isUpdated;

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    private int current;

    private int num;

    public boolean isUpdated() {
        return isUpdated;
    }

    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }

    public ReentrantLockThread(int num, boolean isUpdated) {
        this.num = num;
        this.isUpdated = isUpdated;
    }

    @Override
    public void run() {
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
        if (!isUpdated) {
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();

            try {
                if (!isUpdated) {
                    current = num + 1;
                    //修改数据
                    isUpdated = true;
                }
                reentrantReadWriteLock.readLock().lock();
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        try {
            System.out.println(Thread.currentThread().getName() + ";获得的值为:" + map.get("reentrantlock"));
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
        HashMap<String, String> map = new HashMap<>();
        //获得读锁
        reentrantReadWriteLock.readLock().lock();
        if (!isUpdated) {
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();

            try {
                if (!isUpdated) {
                    System.out.println(Thread.currentThread().getName() + ";开始修改数据");
                    current = num;
                    //修改数据
                    isUpdated = true;
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() + ";获得的值为:" + current);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (reentrantReadWriteLock.getReadHoldCount() > 0) {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
    }

}
