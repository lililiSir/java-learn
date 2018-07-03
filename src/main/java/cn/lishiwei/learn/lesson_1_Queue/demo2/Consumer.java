package cn.lishiwei.learn.lesson_1_Queue.demo2;


/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By:
 */
public class Consumer implements Runnable {

    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // while (true) {
        queue.take();
        // }
    }
}
