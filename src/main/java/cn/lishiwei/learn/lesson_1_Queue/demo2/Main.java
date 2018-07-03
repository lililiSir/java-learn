package cn.lishiwei.learn.lesson_1_Queue.demo2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        //声明阻塞队列
        Queue queue=new Queue();


        Producer producer = new Producer(queue);

        Consumer consumer = new Consumer(queue);


        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 6; i++) {
            service.submit(producer);
            service.submit(consumer);
        }

        service.shutdown();
    }

}
