package cn.lishiwei.learn.lesson_8_Thread.lesson_8_3_volatile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) throws InterruptedException {

        VolatileClass volatileClass = new VolatileClass();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(volatileClass);
        executorService.execute(volatileClass);
        executorService.execute(volatileClass);
        executorService.execute(volatileClass);
        executorService.execute(volatileClass);
        executorService.shutdown();
        Thread.sleep(2000);
        System.out.println("主线程停止2S，并将标记为设置为true");

        volatileClass.setOver(true);

    }

}
