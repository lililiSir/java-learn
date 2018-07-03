package cn.lishiwei.learn.lesson_1_Queue.demo2;


/**
 * @Author: LiShiwei.
 * @Date:Created in 2018/7/3.
 * @Description:
 * @Modified By:
 */
public class Producer implements Runnable {

    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // while (true) {
        queue.put();
        // }
    }
}
