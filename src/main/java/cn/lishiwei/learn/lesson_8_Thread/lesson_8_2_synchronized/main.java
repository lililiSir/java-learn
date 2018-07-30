package cn.lishiwei.learn.lesson_8_Thread.lesson_8_2_synchronized;

public class main {


    public static void main(String[] args) {

        SynchronizedClass synchronizedClass1 = new SynchronizedClass();

        SynchronizedClass synchronizedClass2 = new SynchronizedClass();

        Thread thread1 = new Thread(synchronizedClass1);
        Thread thread2 = new Thread(synchronizedClass2);

        thread1.start();
        thread2.start();

    }

}
