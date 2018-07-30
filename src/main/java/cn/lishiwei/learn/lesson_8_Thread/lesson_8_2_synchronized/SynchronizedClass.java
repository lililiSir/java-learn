package cn.lishiwei.learn.lesson_8_Thread.lesson_8_2_synchronized;


public class SynchronizedClass implements Runnable {

    @Override
    public void run() {
//        method();
        method2();
    }

    /**
     * 与synchronized(this)一样，都是作用于new的实例对象，多个new对象分别持有自己的对象锁
     */
    public synchronized void method() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ";i=" + i);
        }
    }

    /**
     * 作用于静态方法，相当于对整个类进行加锁，不论new了多少个新的对象，都会使用同一个类锁
     */
    public static synchronized void method2() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ";i=" + i);
        }

    }

}
