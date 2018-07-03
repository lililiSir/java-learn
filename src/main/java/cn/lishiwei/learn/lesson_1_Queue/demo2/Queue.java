package cn.lishiwei.learn.lesson_1_Queue.demo2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By: 生产者和消费者共用
 */
public class Queue {

    private BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(10);

    public void put() {
        try {
            arrayBlockingQueue.put("苹果");
            System.out.println("生产苹果一个");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public String take() {
        String result = "";
        try {
            result = arrayBlockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费：" + result);
        return result;
    }


}
