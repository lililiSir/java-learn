package cn.lishiwei.learn.lesson_1_Queue.demo1;

import java.util.AbstractQueue;
import java.util.concurrent.CountDownLatch;


/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By:
 */
public class Consumer implements Runnable {

    private AbstractQueue<String> concurrentLinkedQueue;

    private CountDownLatch countDownLatch;

    public Consumer(AbstractQueue<String> concurrentLinkedQueue, CountDownLatch countDownLatch) {
        this.concurrentLinkedQueue = concurrentLinkedQueue;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        while (!concurrentLinkedQueue.isEmpty()) {
            System.out.println(concurrentLinkedQueue.poll());
            countDownLatch.countDown();
        }
    }
}
