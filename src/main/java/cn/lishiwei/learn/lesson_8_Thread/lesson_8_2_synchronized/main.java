package cn.lishiwei.learn.lesson_8_Thread.lesson_8_2_synchronized;

import com.sun.corba.se.impl.orbutil.closure.Future;
import com.sun.org.apache.xalan.internal.utils.FeatureManager;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SynchronizedClass synchronizedClass1 = new SynchronizedClass();

        SynchronizedClass synchronizedClass2 = new SynchronizedClass();

        // Thread thread1 = new Thread(synchronizedClass1);
        // Thread thread2 = new Thread(synchronizedClass2);
        //
        // thread1.start();
        // thread2.start();

        ExecutorService executorService = Executors.newCachedThreadPool();

        String result = "true";

        java.util.concurrent.Future<String> future = executorService.submit(synchronizedClass1, result);

        if (future.get().equals("true")) {
            System.out.println("线程执行完毕，执行成功");
        }

        System.out.println(
                executorService.submit(() -> {
                    synchronizedClass2.method();
                    return "ok";
                }).get());

        executorService.shutdown();
        while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("线程还在执行。。。");
        }

    }

}
