package cn.lishiwei.learn.lesson_8_Thread.lesson_8_1;

public class main {

    public static void main(String[] args) {

        //重写Run方法
        Thread thread = new Thread(() ->
                System.out.println("重写run 方法")
        );

        thread.start();
        thread.isInterrupted();
        Thread.interrupted();

        System.out.println("main 线程");
    }
}
