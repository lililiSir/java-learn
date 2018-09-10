package cn.lishiwei.learn.lesson_8_Thread.lesson_8_6_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-05.
 * @Description:
 * @Modified By:
 */
public class main {

    //信号量，初始化时需要设定信号量的令牌数量
    public static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Producter producter = new Producter();
        Consumer consumer = new Consumer();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(producter);
        executorService.execute(consumer);
        executorService.shutdown();
    }

    /**
     * 生产者
     */
    static class Producter implements Runnable {

        @Override
        public void run() {
            while (semaphore.tryAcquire()) {
                //尝试获取信号量，如果获取到，则生产一个产品
                System.out.println("开始生产产品");
            }
        }
    }

    /**
     * 消费者
     */
    static class Consumer implements Runnable {

        @Override
        public void run() {
            while (!semaphore.tryAcquire()) {
                //尝试获取信号量，如果获取到，则生产一个产品
                System.out.println("开始消费产品");
                semaphore.release();
            }
        }
    }

}
