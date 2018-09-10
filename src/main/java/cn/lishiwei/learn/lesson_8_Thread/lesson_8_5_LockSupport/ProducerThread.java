package cn.lishiwei.learn.lesson_8_Thread.lesson_8_5_LockSupport;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-08-24.
 * @Description:
 * @Modified By:
 */
public class ProducerThread implements Runnable {

    private ProductFactory productFactory;

    public ProducerThread(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @Override
    public void run() {

        while (true) {
            productFactory.push("苹果");
        }
    }
}
