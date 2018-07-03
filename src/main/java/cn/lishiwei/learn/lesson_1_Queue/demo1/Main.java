package cn.lishiwei.learn.lesson_1_Queue.demo1;

import java.util.AbstractQueue;
import java.util.concurrent.*;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {

        long timeStart = System.currentTimeMillis();
        AbstractQueue<String> abstractQueue = new ConcurrentLinkedQueue<>();

        CountDownLatch countDownLatch = new CountDownLatch(1000000);

        for (int i = 0; i < 1000000; i++) {
            abstractQueue.offer("off-" + i);
        }

        //构造线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Consumer(abstractQueue, countDownLatch));
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (abstractQueue.isEmpty()) {
            System.out.println("cost time "
                    + (System.currentTimeMillis() - timeStart) + "ms");
            executorService.shutdown();
        }
    }
}
