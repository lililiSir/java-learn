package cn.lishiwei.learn.lesson_8_Thread.lesson_8_5_LockSupport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/8/9.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) throws InterruptedException {

        ProductFactory productFactory = new ProductFactory();

        ProducerThread producerThread = new ProducerThread(productFactory);
        CustomerThread customerThread = new CustomerThread(productFactory);


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producerThread);
        executorService.submit(customerThread);
    }

}
