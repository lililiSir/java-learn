package cn.lishiwei.learn.lesson_8_Thread.lesson_8_5_LockSupport;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-08-24.
 * @Description:
 * @Modified By:
 */
public class CustomerThread implements Runnable {

    private ProductFactory productFactory;

    public CustomerThread(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }


    @Override
    public void run() {
        while (true) {
            productFactory.take();
        }

    }
}
