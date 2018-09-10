package cn.lishiwei.learn.lesson_8_Thread.lesson_8_5_LockSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-08-24.
 * @Description:
 * @Modified By:
 */
public class ProductFactory {

    //定义容量大小为1
    private List<String> list = new ArrayList<>(5);

    //定义锁
    private ReentrantLock lock = new ReentrantLock();
    //定义生产锁
    private Condition productCondition = lock.newCondition();
    //定义消费锁
    private Condition customerCondition = lock.newCondition();

    public void push(String value) {

        lock.lock();
        if (list.size() == 5) {
            //暂停生产
            try {
                productCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我正在生成一个苹果，这个苹果又大又好吃");
        list.add(value);

        customerCondition.signalAll();
        lock.unlock();
    }

    public void take() {

        lock.lock();

        if (list.isEmpty()) {
            try {
                customerCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("我正在消费一个产品:" + list.get(0));
        list.remove(0);
        productCondition.signalAll();
        lock.unlock();
    }

}
